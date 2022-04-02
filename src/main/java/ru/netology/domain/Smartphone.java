package ru.netology.domain;

public class Smartphone extends Product {
    private final String manufacturer;
    private final String name;

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }


}

