package com.example.Electronics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Electronics.Entity.Electronics;

public interface ElectronicsRepository extends JpaRepository<Electronics, Integer> {

	Electronics findByName(String name);

}
