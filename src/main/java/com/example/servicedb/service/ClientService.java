package com.example.servicedb.service;

import com.example.servicedb.model.Clients;
import com.example.servicedb.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepo clientRepo;

    public List<Clients> findAll(String keyword) {
        Sort sort = Sort.by(Sort.Direction.ASC, "name");
        if (keyword != null) {
            return clientRepo.findAll(keyword, sort);
        }
        return clientRepo.findAll();
    }

    public Clients get(Integer id_client) {
        return clientRepo.findById(id_client).get();
    }

    public void saveClient(Clients client){
        clientRepo.save(client);
    }

    public void deleteById(Integer id_client) {
        clientRepo.deleteById(id_client);
    }

    public Clients findById(Integer id_client){
        return clientRepo.getById(id_client);
    }
}
