package com.cruddemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cruddemo.entities.Location;
import com.cruddemo.repositories.LocationRepository;

@RestController
@RequestMapping("/location/api2")//api-url
public class LocationRestController {
	
	
	@Autowired
	private LocationRepository locationRepo;
	
	@GetMapping
	public List<Location> getLocation(){
		List<Location> location = locationRepo.findAll();
		return location;
		
	}
	
	@PostMapping
	public void saveLocation(@RequestBody Location location) {
		locationRepo.save(location);
		
	}
	@PutMapping
	public void updateLocation(@RequestBody Location location) {
		locationRepo.save(location);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteLocation(@PathVariable("id")long id) {
		locationRepo.deleteById(id);
		
	}
	
	@GetMapping("/get/{id}")
	public Location getLocationById(@PathVariable("id")long id) {
		try {
			Optional<Location> findById = locationRepo.findById(id);
		    Location location = findById.get();
		    return location;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	

}
