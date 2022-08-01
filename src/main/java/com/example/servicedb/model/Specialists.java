package com.example.servicedb.model;

import javax.persistence.*;

@Entity
@Table(name="specialists")
public class Specialists {
    @Id
    private int id_specialist;
    private String name;
    private String phone_number;
    private String experience;

    public Specialists(){

    }

    public int getId_specialist() {
        return id_specialist;
    }

    public void setId_specialist(int id_specialist) {
        this.id_specialist = id_specialist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
