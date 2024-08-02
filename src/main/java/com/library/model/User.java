package com.library.model;

public class User implements Comparable<Object>{
    
    private int id;
    private String name;
    private String phone;
    private String address;

    public User(int id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public int compareTo(Object obj) {
        User myUser = (User) obj;
        return Integer.compare(this.id, myUser.id);  
    }
    
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


    @Override
    public String toString() {
        return //"User [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
        String.format("ID: %-3d | Name: %-20s | Phone: %-15s | Address: %-25s",id,name,phone,address);
    } 

    // @Override
    // public String toString() {
    //     return String.format("ID: %-3d | ISBN: %-17s | Title: %-30s | Author: %-20s | Loaned: %-5s",
    //             id, isbn, title, author, isLoaned);
    // }
}
