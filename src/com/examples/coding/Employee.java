package com.examples.coding;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private List<String> phoneNumber;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Employee(String name, List<String> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', phoneNumber='" + phoneNumber + "'}";
    }
}