package com.example.Electronics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Electronics.Entity.Electronics;
import com.example.Electronics.Service.ElectronicsService;

@RestController
public class ElectronicsController {

	@Autowired
	private ElectronicsService service;
@PostMapping("/addElectronic")	
public Electronics addElectronic(@RequestBody Electronics electronic) {
		
		return service.saveElectronic(electronic);
	}
	
@PostMapping("/addElectronics")
    public List<Electronics> addElectronics(@RequestBody List<Electronics> electronics) {
		
		return service.saveElectronics(electronics);
	}

@GetMapping("/Electronics")
   public List<Electronics> findAllElectronics()
    {
    	return service.getElectronics();
    }
    
    @GetMapping("/Electronic/{id}")
    public Electronics findElectronicsById(@PathVariable int id)
    {
    	return service.getElectronicsById(id);
    }
    
    @GetMapping("/Electronic/{name}")
    public Electronics findElectronicsByName(@PathVariable String name)
    {
    	return service.getElectronicsByName(name);
    }
    
    public String deleteElectronic(@PathVariable int id) {
    	return service.deleteElectronic(id);
    	
    }
    
}
