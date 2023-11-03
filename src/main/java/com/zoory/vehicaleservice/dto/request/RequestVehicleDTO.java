package com.zoory.vehicaleservice.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestVehicleDTO {
    private String brand;
    private String category;
    private String fuelType;
    private String isHybrid;
    private String fuelConsumption;

    private String vehicleFontImg;
    private String    vehicleRearImg;


    private int seatCapacity;
    private String vehicleType;
    private String transmissionMedium;
    private int qty;
    private String feeFor1km;
    private String driverName;
    private String driverContactNo;

    private String    driverLicenseFontImg;
    private String  driverLicenseRearImg;

    private String remarks;
}
