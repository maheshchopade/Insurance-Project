package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="DriverLicenseTable")
public class DriverLicense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "USER_SEQ", allocationSize = 1)
	private Integer driverId;
	
	
	private String driverName;
    private String driverMobNumber;
    private String licenseId;
    private String licenseType;
	public Integer getDriverId() {
		return driverId;
	}
	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverMobNumber() {
		return driverMobNumber;
	}
	public void setDriverMobNumber(String driverMobNumber) {
		this.driverMobNumber = driverMobNumber;
	}
	public String getLicenseId() {
		return licenseId;
	}
	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}
	public String getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	@Override
	public String toString() {
		return "DriverLicense [driverId=" + driverId + ", driverName=" + driverName + ", driverMobNumber="
				+ driverMobNumber + ", licenseId=" + licenseId + ", licenseType=" + licenseType + "]";
	}
    
    

}
