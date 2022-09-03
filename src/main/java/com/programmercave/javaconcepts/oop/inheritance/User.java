package com.programmercave.javaconcepts.oop.inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.lang.Integer;

public class User {
    private String name;
    private String email;
    private Integer age;
    private String address;

    public User(String name, String email, Integer age, String address) {
    	this.name = name;
    	this.email = email;
    	this.age = age;
    	this.address = address;
    }

    public String getName() {
    	return this.name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    public String getEmail() {
    	return this.email;
    }

    public void setEmail(String email) {
    	this.email = email;
    }

    public Integer getAge() {
    	return this.age;
    }

    public void setAge(Integer age) {
    	this.age = age;
    }

    public String getAddress() {
    	return this.address;
    }

    public void setAddress(String address) {
    	this.address = address;
    }

    public void changeEmail(String email) {
        this.email = email;
    }
}