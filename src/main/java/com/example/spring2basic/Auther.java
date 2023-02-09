package com.example.spring2basic;

import jakarta.persistence.*;

@Entity
@Table(name = "auther")
public class Auther {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String auther_name;
    private int book_Written;
    private int age;

    public Auther() {
    }

    public Auther(int id, String auther_name, int book_Written, int age) {
        this.id = id;
        this.auther_name = auther_name;
        this.book_Written = book_Written;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuther_name() {
        return auther_name;
    }

    public void setAuther_name(String auther_name) {
        this.auther_name = auther_name;
    }

    public int getBook_Written() {
        return book_Written;
    }

    public void setBook_Written(int book_Written) {
        this.book_Written = book_Written;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
