package com.example.demo.service;

import com.example.demo.entity.Climatescenario;
import com.example.demo.repository.Climatescenariorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Climatescenarioservice {

    @Autowired
    private Climatescenariorepository climatescenariorepository;

    public Climatescenario saveScenario(Climatescenario scenario) {

        double temperatureRise =
                (scenario.getCarbonEmission() * 0.5)
                + (scenario.getDeforestationRate() * 0.3)
                - (scenario.getRenewableEnergyUsage() * 0.2);

        double pollutionIndex =
                (scenario.getCarbonEmission() * 0.4)
                + (scenario.getDeforestationRate() * 0.6);

        scenario.setTemperatureRise(temperatureRise);
        scenario.setPollutionIndex(pollutionIndex);

        return climatescenariorepository.save(scenario);
    }

    public List<Climatescenario> getAllScenarios() {
        return climatescenariorepository.findAll();
    }
}