package com.zoory.vehicaleservice.service;

import com.zoory.vehicaleservice.dto.request.RequestVehicleDTO;
import com.zoory.vehicaleservice.entity.Vehicle;

public interface VehicleService {
    public void saveVehicle(RequestVehicleDTO requestVehicleDTO);
    public Vehicle updateVehicle(Long id,RequestVehicleDTO requestVehicleDTO);
    public Vehicle deleteVehicle(Long id);

}
