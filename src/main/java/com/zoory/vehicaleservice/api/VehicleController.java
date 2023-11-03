package com.zoory.vehicaleservice.api;

import com.zoory.vehicaleservice.dto.request.RequestVehicleDTO;
import com.zoory.vehicaleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public String addVehicle(@ModelAttribute RequestVehicleDTO requestVehicleDTO
    ){
        vehicleService.saveVehicle(requestVehicleDTO);
        System.out.println(requestVehicleDTO);
        return requestVehicleDTO.getBrand();
    }
@PutMapping
    public void updateVehicle(){
    System.out.println("Put mapping");
}
}
