package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.ResourceNotFoundException;
import com.example.model.DriverLicense;
import com.example.repository.DriverRepoitory;
import com.example.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService{
	
	@Autowired
	private DriverRepoitory driverRepoitory;

	@Override
	public DriverLicense saveDriverDetails(DriverLicense driverLicense) {
		 DriverLicense  driverLicense1=driverRepoitory.save( driverLicense);
		return driverLicense1;
	}

	@Override
	public List<DriverLicense> getAllLicense() {
		List<DriverLicense>  listOfLicense=driverRepoitory.findAll();
		return listOfLicense;
	}

	@Override
	public DriverLicense getLicenseById(Integer driverId) {
	    return driverRepoitory.findById(driverId)
	        .orElseThrow(() -> new ResourceNotFoundException("Driver ID " + driverId + " not found"));
	}


	@Override
	public DriverLicense updateDriverLicense(Integer driverId, DriverLicense updatedLicense) {
		DriverLicense existing = driverRepoitory.findById(driverId)
			    .orElseThrow(() -> new ResourceNotFoundException("Driver ID " + driverId + " not found"));

			existing.setDriverName(updatedLicense.getDriverName());
			existing.setDriverMobNumber(updatedLicense.getDriverMobNumber());
			existing.setLicenseId(updatedLicense.getLicenseId());
			existing.setLicenseType(updatedLicense.getLicenseType());

			return driverRepoitory.save(existing);
	}
	
			@Override
	public void deleteLicenseByid(Integer driverId) {
				driverRepoitory.findById(driverId)
				.orElseThrow(() -> new ResourceNotFoundException("Driver ID " + driverId + " not found"));
		driverRepoitory.deleteById(driverId);
		
	}

}
