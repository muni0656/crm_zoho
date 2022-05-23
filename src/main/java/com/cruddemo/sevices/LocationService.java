package com.cruddemo.sevices;

import java.util.List;

import com.cruddemo.entities.Location;

public interface LocationService {
	public void saveLocation(Location location);

	public List<Location> getAllLocation();

	public void deleteLocationById(long id);

	public Location getLocationById(long id);

}
