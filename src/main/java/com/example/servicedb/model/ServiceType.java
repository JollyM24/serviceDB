package com.example.servicedb.model;

import javax.persistence.*;

@Entity
@Table(name="service_type")
public class ServiceType {
    @Id
    private int id_service_type;
    private String service_name;

    public ServiceType(){

    }

    public int getId_service_type() {
        return id_service_type;
    }

    public void setId_service_type(int id_service_type) {
        this.id_service_type = id_service_type;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }
}
