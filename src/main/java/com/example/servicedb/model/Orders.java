package com.example.servicedb.model;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Orders {
    @Id
    private int id_order;
    private int id_computer;
    private int id_specialist;
    private int id_service_type;
    private String start_date;
    private String end_date;
    private String is_completed;
    private int price;

    public int getId_order() {
        return id_order;
    }

    public void setId_order(int id_order) {
        this.id_order = id_order;
    }

    public int getId_computer() {
        return id_computer;
    }

    public void setId_computer(int id_computer) {
        this.id_computer = id_computer;
    }

    public int getId_specialist() {
        return id_specialist;
    }

    public void setId_specialist(int id_specialist) {
        this.id_specialist = id_specialist;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getId_service_type() {
        return id_service_type;
    }

    public void setId_service_type(int id_service_type) {
        this.id_service_type = id_service_type;
    }

    public String getIs_completed() {
        return is_completed;
    }

    public void setIs_completed(String is_completed) {
        this.is_completed = is_completed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Orders(){

    }
}
