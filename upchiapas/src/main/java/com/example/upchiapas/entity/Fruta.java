package com.example.upchiapas.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fruta {

    @Id
    @GeneratedValue
    private int Id;

    private String Name;

    private int Quantity;


    public Fruta() {
    }

    public Fruta(int id, String name, int quantity) {
        Id = id;
        Name = name;
        Quantity = quantity;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
