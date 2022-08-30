package com.example.Electronics.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Electronics.Entity.Electronics;
import com.example.Electronics.Repository.ElectronicsRepository;

@Service
public class ElectronicsService {
	
	@Autowired
	private ElectronicsRepository repository;
	
	public Electronics saveElectronic(Electronics electronic) {
		
		return repository.save(electronic);
	}
	
    public List<Electronics> saveElectronics(List<Electronics> electronics) {
		
		return repository.saveAll(electronics);
	}
    
    public List<Electronics> getElectronics()
    {
    	return repository.findAll();
    }
    
    public Electronics getElectronicsById(int id)
    {
    	return repository.findById(id).orElse(null);
    }
    
    public Electronics getElectronicsByName(String name)
    {
    	return repository.findByName(name);
    }
    
    public String deleteElectronic(int id) {
    	repository.deleteById(id);
    	return "electronic removed";
    }
    
    

}
