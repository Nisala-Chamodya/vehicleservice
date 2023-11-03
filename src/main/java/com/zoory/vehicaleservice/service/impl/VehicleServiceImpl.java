package com.zoory.vehicaleservice.service.impl;

import com.zoory.vehicaleservice.dto.request.RequestVehicleDTO;
import com.zoory.vehicaleservice.entity.Vehicle;
import com.zoory.vehicaleservice.repo.VehicleRepo;
import com.zoory.vehicaleservice.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepo vehicleRepo;


    @Override
    public void saveVehicle(RequestVehicleDTO requestVehicleDTO) {
        UUID uuid = UUID.randomUUID();
        long id = uuid.getMostSignificantBits();


        Vehicle vehicle =new Vehicle(
                id,requestVehicleDTO.getBrand(),requestVehicleDTO.getCategory(),
                requestVehicleDTO.getFuelType(),requestVehicleDTO.getIsHybrid(),requestVehicleDTO.getFuelConsumption(),
                requestVehicleDTO.getVehicleFontImg(),requestVehicleDTO.getVehicleRearImg(),requestVehicleDTO.getSeatCapacity(),
                requestVehicleDTO.getVehicleType(),requestVehicleDTO.getTransmissionMedium(),
                requestVehicleDTO.getQty(),requestVehicleDTO.getFeeFor1km(),requestVehicleDTO.getDriverName(),
                requestVehicleDTO.getDriverContactNo(),requestVehicleDTO.getDriverLicenseFontImg(),requestVehicleDTO.getDriverLicenseRearImg(),
                requestVehicleDTO.getRemarks()
        );
        vehicleRepo.save(vehicle);
    }

    @Override
    public Vehicle updateVehicle(Long id, RequestVehicleDTO requestVehicleDTO) {
        Vehicle vehicleVar=vehicleRepo.findById(id).get();
        vehicleVar.setBrand(requestVehicleDTO.getBrand());
        vehicleVar.setCategory(requestVehicleDTO.getCategory());
        vehicleVar.setFuelType(requestVehicleDTO.getFuelType());
        vehicleVar.setIsHybrid(requestVehicleDTO.getIsHybrid());
        vehicleVar.setFuelConsumption(requestVehicleDTO.getFuelConsumption());

        vehicleVar.setVehicleFontImg(requestVehicleDTO.getVehicleFontImg());
        vehicleVar.setVehicleRearImg(requestVehicleDTO.getVehicleRearImg());

        vehicleVar.setSeatCapacity(requestVehicleDTO.getSeatCapacity());
        vehicleVar.setVehicleType(requestVehicleDTO.getVehicleType());
        vehicleVar.setTransmissionMedium(requestVehicleDTO.getTransmissionMedium());
        vehicleVar.setQty(requestVehicleDTO.getQty());
        vehicleVar.setFeeFor1km(requestVehicleDTO.getFeeFor1km());
        vehicleVar.setDriverName(requestVehicleDTO.getDriverName());
        vehicleVar.setDriverContactNo(requestVehicleDTO.getDriverContactNo());

        vehicleVar.setDriverLicenseFontImg(requestVehicleDTO.getDriverLicenseFontImg());
        vehicleVar.setDriverLicenseRearImg(requestVehicleDTO.getDriverLicenseRearImg());

        vehicleVar.setRemarks(requestVehicleDTO.getRemarks());

        vehicleRepo.save(vehicleVar);
        return vehicleVar;

    }

    @Override
    public Vehicle deleteVehicle(Long id) {
       Vehicle vehicle=vehicleRepo.findById(id).get();
       vehicleRepo.delete(vehicle);
       return vehicle;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        System.out.println("Find All "+vehicleRepo.findAll());
        return vehicleRepo.findAll();
    }
}
