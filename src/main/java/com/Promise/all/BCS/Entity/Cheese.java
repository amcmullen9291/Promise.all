package com.Promise.all.BCS.Entity;

import javax.persistence.*;

@Entity
@Table(name = "cheeses")
public class Cheese {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "cheese_name")
    private String cheese_name;

    @Column(name = "beverage1_name")
    private String beverage1_name;

    @Column(name = "beverage2_name")
    private String beverage2_name;

    @Column(name = "beverage3_name")
    private String beverage3_name;

    @Column(name = "beverage4_name")
    private String beverage4_name;

    @Column(name = "beverage5_name")
    private String beverage5_name;

    @Column(name = "beverage6_name")
    private String beverage6_name;

    @Column(name = "beverage7_name")
    private String beverage7_name;

    @Column(name = "origin")
    private String country_of_origin;

    @Column(name = "aging_period")
    private String aging_period;

    @Column(name = "milk_type")
    private String type_of_milk;

    @Column(name = "taste")
    private String taste;

    @Column(name = "best_uses")
    private String best_uses;

    @Column(name = "notes")
    private String notes;

    @Column(name = "image")
    private String image;

    public Cheese(long id, String cheese_name, String beverage1_name, String beverage2_name, String beverage3_name, String beverage4_name, String beverage5_name, String beverage6_name, String beverage7_name, String country_of_origin, String aging_period, String type_of_milk, String taste, String best_uses, String notes, String image) {
        this.id = id;
        this.cheese_name = cheese_name;
        this.beverage1_name = beverage1_name;
        this.beverage2_name = beverage2_name;
        this.beverage3_name = beverage3_name;
        this.beverage4_name = beverage4_name;
        this.beverage5_name = beverage5_name;
        this.beverage6_name = beverage6_name;
        this.beverage7_name = beverage7_name;
        this.country_of_origin = country_of_origin;
        this.aging_period = aging_period;
        this.type_of_milk = type_of_milk;
        this.taste = taste;
        this.best_uses = best_uses;
        this.notes = notes;
        this.image = image;
    }

    public Cheese(){}

    public long getId() {
        return id;
    }

    public String getCheese_name() {
        return cheese_name;
    }

    public void setCheese_name(String cheese_name) {
        this.cheese_name = cheese_name;
    }

    public String getBeverage1_name() {
        return beverage1_name;
    }

    public void setBeverage1_name(String beverage1_name) {
        this.beverage1_name = beverage1_name;
    }

    public String getBeverage2_name() {
        return beverage2_name;
    }

    public void setBeverage2_name(String beverage2_name) {
        this.beverage2_name = beverage2_name;
    }

    public String getBeverage3_name() {
        return beverage3_name;
    }

    public void setBeverage3_name(String beverage3_name) {
        this.beverage3_name = beverage3_name;
    }

    public String getBeverage4_name() {
        return beverage4_name;
    }

    public void setBeverage4_name(String beverage4_name) {
        this.beverage4_name = beverage4_name;
    }

    public String getBeverage5_name() {
        return beverage5_name;
    }

    public void setBeverage5_name(String beverage5_name) {
        this.beverage5_name = beverage5_name;
    }

    public String getBeverage6_name() {
        return beverage6_name;
    }

    public void setBeverage6_name(String beverage6_name) {
        this.beverage6_name = beverage6_name;
    }

    public String getBeverage7_name() {
        return beverage7_name;
    }

    public void setBeverage7_name(String beverage7_name) {
        this.beverage7_name = beverage7_name;
    }

    public String getCountry_of_origin() {
        return country_of_origin;
    }

    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }

    public String getAging_period() {
        return aging_period;
    }

    public void setAging_period(String aging_period) {
        this.aging_period = aging_period;
    }

    public String getType_of_milk() {
        return type_of_milk;
    }

    public void setType_of_milk(String type_of_milk) {
        this.type_of_milk = type_of_milk;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getBest_uses() {
        return best_uses;
    }

    public void setBest_uses(String best_uses) {
        this.best_uses = best_uses;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

