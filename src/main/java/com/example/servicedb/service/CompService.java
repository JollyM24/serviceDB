package com.example.servicedb.service;

import com.example.servicedb.model.Clients;
import com.example.servicedb.model.Computers;
import com.example.servicedb.repository.ClientRepo;
import com.example.servicedb.repository.CompRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompService {
    @Autowired
    CompRepo compRepo;

    public Computers findById(Integer id_computer){
        return compRepo.getById(id_computer);
    }

    public List<Computers> findAll() {
        return compRepo.findAll();
    }

    public Computers get(Integer id_computer) {
        return compRepo.findById(id_computer).get();
    }

    public void saveComputer(Computers computer){
        compRepo.save(computer);
    }

    public void deleteById(Integer id_computer) {
        compRepo.deleteById(id_computer);
    }
}
