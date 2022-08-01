package com.example.servicedb.service;

import com.example.servicedb.model.Clients;
import com.example.servicedb.model.Orders;
import com.example.servicedb.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;

    public Orders findById(Integer id_order) {
        return orderRepo.getById(id_order);
    }

    public Orders get(Integer id_order) {
        return orderRepo.findById(id_order).get();
    }

    public List<Orders> findAll() {return orderRepo.findAll();}

    public void saveOrder(Orders order){
        orderRepo.save(order);
    }

    public void deleteById(Integer id_order) {
        orderRepo.deleteById(id_order);
    }
}