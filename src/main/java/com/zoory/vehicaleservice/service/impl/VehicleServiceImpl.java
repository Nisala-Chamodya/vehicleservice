package com.zoory.vehicaleservice.service.impl;

import com.zoory.vehicaleservice.dto.request.RequestVehicleDTO;
import com.zoory.vehicaleservice.entity.Vehicle;
import com.zoory.vehicaleservice.repo.VehicleRepo;
import com.zoory.vehicaleservice.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepo vehicleRepo;


    ModelMapper mapper;
    @Override
    public void saveVehicle(RequestVehicleDTO requestVehicleDTO) {
        UUID uuid = UUID.randomUUID();
        long id = uuid.getMostSignificantBits();

        Vehicle mapped = mapper.map(requestVehicleDTO, Vehicle.class);
        mapped.setId(id);
        vehicleRepo.save(mapped);

    }
}
