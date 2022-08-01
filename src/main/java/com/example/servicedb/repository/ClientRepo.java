package com.example.servicedb.repository;

import com.example.servicedb.model.Clients;
import com.example.servicedb.model.Specialists;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepo  extends JpaRepository<Clients,Integer> {
    @Query("SELECT p FROM Clients p WHERE p.name LIKE %?1%")
    public List<Clients> findAll(String keyword, Sort sort);
}
