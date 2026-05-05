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
    private Climatescenarioservice climatescenarioservice;

    @PostMapping
    public Climatescenario createScenario(@RequestBody Climatescenario scenario) {
        return climatescenarioservice.saveScenario(scenario);
    }

    @GetMapping
    public List<Climatescenario> getAllScenarios() {
        return climatescenarioservice.getAllScenarios();
    }
}