package com.zoory.vehicaleservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Vehicle {
    @Id
    private long id;
    private String brand;
    private String category;
    private String fuelType;
    private String isHybrid;
    private String fuelConsumption;


    private  String vehicleFontImg;

    private String vehicleRearImg;


    private int seatCapacity;
    private String vehicleType;
    private String transmissionMedium;
    private int qty;
    private String feeFor1km;
    private String driverName;
    private String driverContactNo;


    private String driverLicenseFontImg;

    private String driverLicenseRearImg;

    private String remarks;
}
