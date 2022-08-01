package com.example.servicedb.repository;

import com.example.servicedb.model.Computers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompRepo  extends JpaRepository<Computers,Integer> {
}
