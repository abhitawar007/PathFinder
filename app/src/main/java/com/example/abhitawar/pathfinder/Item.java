package com.example.abhitawar.pathfinder;

import java.io.Serializable;

public class Item implements Serializable
{

    private String brand;
    private String name;
    private int id;
    private double price;
    private String store;
    private String location;

    public Item()
    {
    }

    public Item(String brand, String name, int id, double price, String store, String location)
    {
        this.brand = brand;
        this.name = name;
        this.id = id;
        this.price = price;
        this.store = store;
        this.location = location;
    }

    public String toString()
    {
        return getBrand() + " "+ getName();
    }
    /***************** Setters and getters *******************/

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}



