/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedantic.entity;

import javax.json.bind.annotation.JsonbNillable;
import javax.json.bind.annotation.JsonbNumberFormat;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.config.PropertyOrderStrategy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedantic
 */
public class Mother {
    private String name;
    private String occupation;
    private BigDecimal salary;
    private Father marriedTo;
    private final List<Child> children = new ArrayList<>();

    public Mother(String name, String occupation, BigDecimal salary, Father marriedTo) {
        this.name = name;
        this.occupation = occupation;
        this.salary = salary;
        this.marriedTo = marriedTo;
    }

    public Mother() {
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

    public Father getMarriedTo() {
        return marriedTo;
    }

    public void setMarriedTo(Father marriedTo) {
        this.marriedTo = marriedTo;
    }

    public List<Child> getChildren() {
        return children;
    }
}
