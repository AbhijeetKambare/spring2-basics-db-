package com.example.spring2basic;

import jakarta.persistence.*;
import jdk.jfr.Name;

@Entity
@Table(name="user_info")
public class User {
    @Id

    private int id;
    private String name;
    private int age;
    @Column(unique = true) //value will bw unique
    private String email;

    @Column(name = "country_nmae")
    private String country;

    public User(int id, String name, int age,String email, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email=email;
        this.country=country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
