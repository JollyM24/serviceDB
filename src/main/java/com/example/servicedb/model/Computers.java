package com.example.servicedb.model;

import javax.persistence.*;

@Entity
@Table(name = "computers")
public class Computers {
    @Id
    private int id_computer;
    private String comp_name;
    private String serial_number;
    private int guarantee;

    public Computers(){

    }

    public int getId_computer() {
        return id_computer;
    }

    public void setId_computer(int id_computer) {
        this.id_computer = id_computer;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }
}

