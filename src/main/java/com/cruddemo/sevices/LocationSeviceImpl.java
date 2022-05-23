package com.cruddemo.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruddemo.entities.Location;
import com.cruddemo.repositories.LocationRepository;

@Service
public class LocationSeviceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepo;

	@Override
	public void saveLocation(Location location) {
		locationRepo.save(location);
		}

	@Override
	public List<Location> getAllLocation() {
		List<Location> location = locationRepo.findAll();
		return location;
	}

	@Override
	public void deleteLocationById(long id) {
		locationRepo.deleteById(id);
		
		
		
	}

	@Override
	public Location getLocationById(long id) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		return location;
	}

}
