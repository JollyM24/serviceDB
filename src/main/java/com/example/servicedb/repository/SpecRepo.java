package com.example.servicedb.repository;

import com.example.servicedb.model.Specialists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpecRepo  extends JpaRepository<Specialists,Integer> {
    @Query("SELECT p FROM Specialists p WHERE "
    + "CONCAT(p.id_specialist, p.name, p.phone_number, p.experience)"
    + " LIKE %?1%")
    public List<Specialists> findAll(String keyword);
}
