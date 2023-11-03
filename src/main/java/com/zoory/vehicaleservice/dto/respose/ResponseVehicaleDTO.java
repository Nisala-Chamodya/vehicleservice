package com.zoory.vehicaleservice.dto.respose;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseVehicaleDTO {
    private long id;
    private String brand;
    private String category;
    private String fuelType;
    private String isHybrid;
    private String fuelConsumption;

    private  byte[] vehicleFontImg;
    private byte[] vehicleRearImg;


    private int seatCapacity;
    private String vehicleType;
    private String transmissionMedium;
    private int qty;
    private String feeFor1km;
    private String driverName;
    private String driverContactNo;

    private byte[] driverLicenseFontImg;
    private byte[] driverLicenseRearImg;

    private String remarks;
}
