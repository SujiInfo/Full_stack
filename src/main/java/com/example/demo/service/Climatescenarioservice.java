package com.example.demo.service;

import com.example.demo.entity.Climatescenario;
import com.example.demo.entity.Region;
import com.example.demo.entity.User;
import com.example.demo.repository.Climatescenariorepository;
import com.example.demo.repository.Regionrepository;
import com.example.demo.repository.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Climatescenarioservice {

    @Autowired
    private Climatescenariorepository repo;

    @Autowired
    private Userrepository userrepo;

    @Autowired
    private Regionrepository regionrepo;

    // ✅ SAVE SCENARIO
    public Climatescenario saveScenario(Climatescenario scenario, Long userId, Long regionId) {
        User user = userrepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found: " + userId));

        Region region = regionrepo.findById(regionId)
                .orElseThrow(() -> new RuntimeException("Region not found: " + regionId));

        scenario.setUser(user);
        scenario.setRegion(region);

        double temperatureRise =
                (scenario.getCarbonEmission() * 0.5)
                        + (scenario.getDeforestationRate() * 0.3)
                        - (scenario.getRenewableEnergyUsage() * 0.2);

        double pollutionIndex =
                (scenario.getCarbonEmission() * 0.4)
                        + (scenario.getDeforestationRate() * 0.6);

        scenario.setTemperatureRise(temperatureRise);
        scenario.setPollutionIndex(pollutionIndex);

        return repo.save(scenario);
    }

    // ✅ GET ALL SCENARIOS
    public List<Climatescenario> getAllScenarios() {
        return repo.findAll();
    }
}