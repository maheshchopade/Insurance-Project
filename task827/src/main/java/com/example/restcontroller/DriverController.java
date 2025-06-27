package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.DriverLicense;
import com.example.repository.DriverRepoitory;
import com.example.service.DriverService;

@RestController
@RequestMapping("driverlicense")
public class DriverController {
	
	@Autowired
	private DriverService driverService;
		
	
	@PostMapping("/save")
	public DriverLicense save(@RequestBody DriverLicense  driverLicense ) {
		DriverLicense driverLicense1=driverService.saveDriverDetails(driverLicense);
		System.out.println("Save Data Sucessfully...!!!");
		return driverLicense1;
		
		}
	
	@GetMapping("/getById/{driverId}")
	public  DriverLicense getById(@PathVariable Integer driverId) {
		DriverLicense driverLicense1=driverService.getLicenseById(driverId);
		System.out.println("get Data Sucessfully...!!!"+driverLicense1);
		return driverLicense1;
		
	}
	@GetMapping("/getAllLicense")
	public List<DriverLicense> getAllLicense() {
		List<DriverLicense> listofLicense=driverService.getAllLicense();
		System.out.println("get Data Sucessfully...!!!"+listofLicense);
		return listofLicense;
	}
	
	@PutMapping("/updateLicense/{driverId}")
	public DriverLicense updateLicense(@PathVariable Integer driverId, @RequestBody DriverLicense updatedLicense) {
		System.out.println("Updated data sucessfully...!!!");
		return driverService.updateDriverLicense(driverId, updatedLicense);
		
	}
	
	@DeleteMapping("/deleteLicenseByid/{driverId}")
	public void deleteLicenseByid(@PathVariable Integer driverId) {
	
		 driverService.deleteLicenseByid(driverId);
			System.out.println("deleted data succesfully...!!!");
	}
	
	

}
