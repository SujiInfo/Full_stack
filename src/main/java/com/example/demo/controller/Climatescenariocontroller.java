package com.example.demo.controller;

import com.example.demo.entity.Climatescenario;
import com.example.demo.service.Climatescenarioservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scenarios")
@CrossOrigin
public class Climatescenariocontroller {

    @Autowired
    private Climatescenarioservice service;

    @PostMapping("/create")
    public Climatescenario createScenario(
            @RequestBody Climatescenario scenario,
            @RequestParam Long userId,
            @RequestParam Long regionId) {

        return service.saveScenario(scenario, userId, regionId);
    }

    @GetMapping
    public List<Climatescenario> getAll() {
        return service.getAllScenarios();
    }
}