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

    private byte[] vehicleFontImg;
    private byte[]    vehicleRearImg;


    private String seatCapacity;
    private String vehicleType;
    private String transmissionMedium;
    private String qty;
    private String feeFor1km;
    private String driverName;
    private String driverContactNo;

    private byte[]    driverLicenseFontImg;
    private byte[]  driverLicenseRearImg;

    private String remarks;
}
