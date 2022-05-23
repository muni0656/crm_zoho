package com.cruddemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import com.cruddemo.dto.LocationData;
import com.cruddemo.entities.Location;
import com.cruddemo.sevices.LocationService;
import com.cruddemo.utilities.EmailService;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private EmailService emailService;

	
	// handler methods
	
	@RequestMapping("/show")
	public String showLocationPage() {
		return"create_location";
	}
	//dto
//	@RequestMapping("/saveLocation")
//	public String saveLocationData(@ModelAttribute("loc")Location location) {
//		locationService.saveLocation(location);
//		return"create_location";
	
	
//	@RequestMapping("/saveLocation")
//	public String saveLocationData(@RequestParam("id") long id, @RequestParam("name")String name, @RequestParam("code") String code, @RequestParam("type")String type) {
//		Location location = new Location();
//		location.setId(id);
//		location.setName(name);
//		location.setCode(code);
//		location.setType(type);
//		locationService.saveLocation(location);
//		return"create_location";
//	}
	
//	@RequestMapping("/saveLocation")
//	public String saveLocationData(LocationData loc, ModelMap model) {
//		Location location = new Location();
//		location.setId(loc.getId());
//		location.setName(loc.getName());
//		location.setCode(loc.getCode());
//		location.setType(loc.getType());
//		model.addAttribute("msg", "Location is saved!");
//		locationService.saveLocation(location);
//		
//		
//		return"create_location";
	
	@RequestMapping("/saveLocation")
	public String saveLocationData(@ModelAttribute("loc")Location location, ModelMap model) {
		locationService.saveLocation(location);
		emailService.sendSimpleMessage("munilalmahto28@gmail.com", "Test", "Welcome Message");
		model.addAttribute("msg", "Location is saved!");
		return"create_location";
	}	
	@RequestMapping("/listall")
	public String listAll(ModelMap model) {
		List<Location> location = locationService.getAllLocation();
	   model.addAttribute("location", location);
		return"search_result";
			
		}
	@RequestMapping("/delete")
	public String deleteLocation(@RequestParam("id")long id, ModelMap model) {
		locationService.deleteLocationById(id);
		List<Location> location = locationService.getAllLocation();
		   model.addAttribute("location", location);
			return"search_result";
		
	}
	@RequestMapping("/update")
	public String updateLocation(@RequestParam("id")long id,ModelMap model) {
		Location location = locationService.getLocationById(id);
		model.addAttribute("location", location);
		return"update_location";
	}
	
	@RequestMapping("/updateData")
	public String updateLocationData(@ModelAttribute("loc")Location location, ModelMap model) {
		locationService.saveLocation(location);
		model.addAttribute("msg","location is updated!");
		return"update_location";

	}	
		
	}
	

