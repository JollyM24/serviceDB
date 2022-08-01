package com.example.servicedb.service;

import com.example.servicedb.model.Computers;
import com.example.servicedb.model.Specialists;
import com.example.servicedb.repository.CompRepo;
import com.example.servicedb.repository.SpecRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecService {
    @Autowired
    SpecRepo specRepo;

    public Specialists findById(Integer id_specialist){
        return specRepo.getById(id_specialist);
    }

    public List<Specialists> findAll(String keyword) {
        if (keyword != null) {
            return specRepo.findAll(keyword);
        }
        return specRepo.findAll();
    }

    public Specialists get(Integer id_specialist) {
        return specRepo.findById(id_specialist).get();
    }

//    public void saveSpecialists(Computers computer){
//        compRepo.save(computer);
//    }
//
//    public void deleteById(Integer id_computer) {
//        compRepo.deleteById(id_computer);
//    }
}
