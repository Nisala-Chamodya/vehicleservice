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

    @Column(nullable = false,columnDefinition = "LONGBLOB",length = 655555555)
    private  byte[] vehicleFontImg;
    @Column(nullable = false,columnDefinition = "LONGBLOB",length = 655555555)
    private byte[] vehicleRearImg;


    private String seatCapacity;
    private String vehicleType;
    private String transmissionMedium;
    private String qty;
    private String feeFor1km;
    private String driverName;
    private String driverContactNo;

    @Column(nullable = false,columnDefinition = "LONGBLOB",length = 655555555)
    private byte[] driverLicenseFontImg;
    @Column(nullable = false,columnDefinition = "LONGBLOB",length = 655555555)
    private byte[] driverLicenseRearImg;

    private String remarks;
}
