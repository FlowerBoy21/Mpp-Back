package com.example.demo;

//create a class named Cow with id, name,breed,adress

public class Cow {
    private int id;
    private String name;
    private String breed;
    private String address;

    public Cow() {
    }

    public Cow(int id, String name, String breed, String address) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getaddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}