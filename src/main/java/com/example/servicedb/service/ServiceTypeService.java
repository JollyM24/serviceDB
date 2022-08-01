package com.example.servicedb.service;

import com.example.servicedb.model.Computers;
import com.example.servicedb.model.ServiceType;
import com.example.servicedb.repository.CompRepo;
import com.example.servicedb.repository.ServiceTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeService {
    @Autowired
    ServiceTypeRepo serTypeRepo;

    public List<ServiceType> findAll() {
        return serTypeRepo.findAll();
    }

    public ServiceType get(Integer id_service_type) {
        return serTypeRepo.findById(id_service_type).get();
    }

    public void saveServiceType(ServiceType serviceType){
        serTypeRepo.save(serviceType);
    }
}
