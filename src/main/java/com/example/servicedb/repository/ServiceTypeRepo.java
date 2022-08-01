package com.example.servicedb.repository;

import com.example.servicedb.model.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceTypeRepo  extends JpaRepository<ServiceType,Integer> {
}
