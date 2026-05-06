package com.example.demo.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String regionName;
    private long population;
    private double forestArea;

    @OneToMany(mappedBy = "region")
    @JsonIgnore
    private List<Climatescenario> scenarios;

    public Region() {
    }

    public Region(Long id, String regionName, long population, double forestArea) {
        this.id = id;
        this.regionName = regionName;
        this.population = population;
        this.forestArea = forestArea;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getForestArea() {
        return forestArea;
    }

    public void setForestArea(double forestArea) {
        this.forestArea = forestArea;
    }

    public List<Climatescenario> getScenarios() {
        return scenarios;
    }

    public void setScenarios(List<Climatescenario> scenarios) {
        this.scenarios = scenarios;
    }
}