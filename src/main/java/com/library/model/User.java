package com.library.model;

public class User implements Comparable<Object>{
    
    //Variables
    private int id;
    private String name;
    private String phone;
    private String address;

    //Constructors
    public User(int id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    //Compare to
    @Override
    public int compareTo(Object obj) {
        User myUser = (User) obj;
        return Integer.compare(this.id, myUser.id);  
    }
    
    //Getters / Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //ToString
    @Override
    public String toString() {
        return //"User [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
        String.format("ID: %-3d | Name: %-20s | Phone: %-15s | Address: %-25s",id,name,phone,address);
    } 
}
