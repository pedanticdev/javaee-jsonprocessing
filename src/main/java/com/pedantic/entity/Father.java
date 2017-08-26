/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedantic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedantic
 */
public class Father {
    private String name;
    private String occupation;
    private BigDecimal salary;
    private Mother marriedTo;
    private final List<Child> children = new ArrayList<>();

    public Father(String name, String occupation, BigDecimal salary, Mother marriedTo) {
        this.name = name;
        this.occupation = occupation;
        this.salary = salary;
        this.marriedTo = marriedTo;
    }

    public Father() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Mother getMarriedTo() {
        return marriedTo;
    }

    public void setMarriedTo(Mother marriedTo) {
        this.marriedTo = marriedTo;
    }

    public List<Child> getChildren() {
        return children;
    }
}
