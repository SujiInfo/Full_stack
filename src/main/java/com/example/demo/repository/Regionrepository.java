package com.example.demo.repository;

import com.example.demo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Regionrepository extends JpaRepository<Region, Long> {
}
