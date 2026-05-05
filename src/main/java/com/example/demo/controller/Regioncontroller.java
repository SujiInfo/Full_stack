package com.example.demo.controller;
import com.example.demo.entity.Region;
import com.example.demo.service.Regionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/regions")
@CrossOrigin
public class Regioncontroller {

    @Autowired
    private Regionservice regionservice;

    @PostMapping
    public Region createRegion(@RequestBody Region region) {
        return regionservice.saveRegion(region);
    }

    @GetMapping
    public List<Region> getAllRegions() {
        return regionservice.getAllRegions();
    }
}