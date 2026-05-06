package com.example.demo.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Climatescenario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String scenarioName;
    private double carbonEmission;
    private double deforestationRate;
    private double renewableEnergyUsage;

    private Double temperatureRise;
    private Double pollutionIndex;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name = "region_id")
    @JsonIgnore
    private Region region;

    // getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public double getCarbonEmission() {
        return carbonEmission;
    }

    public void setCarbonEmission(double carbonEmission) {
        this.carbonEmission = carbonEmission;
    }

    public double getDeforestationRate() {
        return deforestationRate;
    }

    public void setDeforestationRate(double deforestationRate) {
        this.deforestationRate = deforestationRate;
    }

    public double getRenewableEnergyUsage() {
        return renewableEnergyUsage;
    }

    public void setRenewableEnergyUsage(double renewableEnergyUsage) {
        this.renewableEnergyUsage = renewableEnergyUsage;
    }

    public Double getTemperatureRise() {
        return temperatureRise;
    }

    public void setTemperatureRise(Double temperatureRise) {
        this.temperatureRise = temperatureRise;
    }

    public Double getPollutionIndex() {
        return pollutionIndex;
    }

    public void setPollutionIndex(Double pollutionIndex) {
        this.pollutionIndex = pollutionIndex;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}