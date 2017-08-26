/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pedantic.entity;

import javax.json.bind.annotation.JsonbAnnotation;
import javax.json.bind.annotation.JsonbNillable;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pedantic
 */
public class Child {
    private String name;
    private String nameOfSchool;
    private Mother mother;
    private Father father;
    @JsonbTransient
    private int age;
    private final List<String> hobbies = new ArrayList<>();

    private LocalDate dateOfBirth ;


    public Child(String name, String nameOfSchool, Mother mother, Father father, int age) {
        this.name = name;
        this.nameOfSchool = nameOfSchool;
        this.mother = mother;
        this.father = father;
        this.age = age;
    }

    public Child() {
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}
