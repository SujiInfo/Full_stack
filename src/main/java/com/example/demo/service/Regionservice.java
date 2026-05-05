package com.example.demo.service;

import com.example.demo.entity.Region;
import com.example.demo.repository.Regionrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Regionservice {

    @Autowired
    private Regionrepository regionrepository;

    public Region saveRegion(Region region) {
        return regionrepository.save(region);
    }

    public List<Region> getAllRegions() {
        return regionrepository.findAll();
    }
}

