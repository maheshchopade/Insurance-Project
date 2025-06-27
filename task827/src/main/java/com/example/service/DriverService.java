package com.example.service;

import java.util.List;

import com.example.model.DriverLicense;

public interface DriverService {
    //save
	public DriverLicense saveDriverDetails(DriverLicense driverLicense);
	
	//Read
	public List<DriverLicense> getAllLicense();
	public DriverLicense getLicenseById(Integer driverId);
	
	//update
	DriverLicense updateDriverLicense(Integer driverId, DriverLicense updatedLicense);

	//delete
	public void deleteLicenseByid(Integer driverId);
}
