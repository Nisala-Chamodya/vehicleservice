package com.zoory.vehicaleservice.api;

import com.zoory.vehicaleservice.dto.request.RequestVehicleDTO;
import com.zoory.vehicaleservice.entity.Vehicle;
import com.zoory.vehicaleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void addVehicle(@RequestPart String brand,
                           @RequestPart String category,
                           @RequestPart String fuelType,
                           @RequestPart String isHybrid,
                           @RequestPart String fuelConsumption,
                           @RequestPart byte[] vehicleFontImg,
                           @RequestPart byte[] vehicleRearImg,
                           @RequestPart String seatCapacity,
                           @RequestPart String vehicleType,
                           @RequestPart String transmissionMedium,
                           @RequestPart String qty,
                           @RequestPart String feeFor1km,
                           @RequestPart String driverName,
                           @RequestPart String driverContactNo,
                           @RequestPart byte[] driverLicenseFontImg,
                           @RequestPart byte[] driverLicenseRearImg,
                           @RequestPart String remarks) {


        RequestVehicleDTO requestVehicleDTO = new RequestVehicleDTO(brand, category, fuelType, isHybrid, fuelConsumption,
                vehicleFontImg, vehicleRearImg, seatCapacity, vehicleType, transmissionMedium, qty, feeFor1km, driverName,
                driverContactNo, driverLicenseFontImg, driverLicenseRearImg, remarks);

        vehicleService.saveVehicle(requestVehicleDTO);
    }

    @PutMapping("/{id}")
    public Vehicle updateVehicle(@PathVariable long id,
                                 @RequestPart String brand,
                                 @RequestPart String category,
                                 @RequestPart String fuelType,
                                 @RequestPart String isHybrid,
                                 @RequestPart String fuelConsumption,
                                 @RequestPart byte[] vehicleFontImg,
                                 @RequestPart byte[] vehicleRearImg,
                                 @RequestPart String seatCapacity,
                                 @RequestPart String vehicleType,
                                 @RequestPart String transmissionMedium,
                                 @RequestPart String qty,
                                 @RequestPart String feeFor1km,
                                 @RequestPart String driverName,
                                 @RequestPart String driverContactNo,
                                 @RequestPart byte[] driverLicenseFontImg,
                                 @RequestPart byte[] driverLicenseRearImg,
                                 @RequestPart String remarks
                             ) {
                                RequestVehicleDTO requestVehicleDTO=new RequestVehicleDTO(brand,category,fuelType,
                                        isHybrid,fuelConsumption,vehicleFontImg,vehicleRearImg,seatCapacity,vehicleType,
                                        transmissionMedium,qty,feeFor1km,driverName,driverContactNo,driverLicenseFontImg,
                                        driverLicenseRearImg,remarks
                                        );
                                return vehicleService.updateVehicle(id,requestVehicleDTO);
                                    }

@DeleteMapping("/{id}")
    public Vehicle deleteVehicle(@PathVariable long id){
        return vehicleService.deleteVehicle(id);
}
@GetMapping
    public List<Vehicle> gelAllVehicles(){
        return vehicleService.getAllVehicles();
}






   }
