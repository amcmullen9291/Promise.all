package com.Promise.all.BCS.Entity;

import javax.persistence.*;

@Entity
@Table(name = "cheeses")
public class Cheese {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "cheese")
    private String cheeseName;

    @Column(name = "beverage1")
    private String beverage1Name;

    @Column(name = "beverage2")
    private String beverage2Name;

    @Column(name = "beverage3")
    private String beverage3Name;

    @Column(name = "beverage4")
    private String beverage4Name;

    @Column(name = "beverage5")
    private String beverage5Name;

    @Column(name = "kind")
    private String kindOfCheese;

    @Column(name = "origin")
    private String countryOfOrigin;

    @Column(name = "aging_period")
    private String agingPeriod;

    @Column(name = "milk_type")
    private String TypeOfMilk;

    @Column(name = "taste")
    private String taste;

    @Column(name = "best_uses")
    private String bestUses;

    @Column(name = "notes")
    private String notes;

    public Cheese(long id, String cheeseName, String beverage1Name, String beverage2Name, String beverage3Name, String beverage4Name, String beverage5Name, String kindOfCheese, String countryOfOrigin, String agingPeriod, String typeOfMilk, String taste, String bestUses, String notes) {
        this.id = id;
        this.cheeseName = cheeseName;
        this.beverage1Name = beverage1Name;
        this.beverage2Name = beverage2Name;
        this.beverage3Name = beverage3Name;
        this.beverage4Name = beverage4Name;
        this.beverage5Name = beverage5Name;
        this.kindOfCheese = kindOfCheese;
        this.countryOfOrigin = countryOfOrigin;
        this.agingPeriod = agingPeriod;
        TypeOfMilk = typeOfMilk;
        this.taste = taste;
        this.bestUses = bestUses;
        this.notes = notes;
    }

    public long getId() {
        return id;
    }

    public String getCheeseName() {
        return cheeseName;
    }

    public void setCheeseName(String cheeseName) {
        this.cheeseName = cheeseName;
    }

    public String getBeverage1Name() {
        return beverage1Name;
    }

    public void setBeverage1Name(String beverage1Name) {
        this.beverage1Name = beverage1Name;
    }

    public String getBeverage2Name() {
        return beverage2Name;
    }

    public void setBeverage2Name(String beverage2Name) {
        this.beverage2Name = beverage2Name;
    }

    public String getBeverage3Name() {
        return beverage3Name;
    }

    public void setBeverage3Name(String beverage3Name) {
        this.beverage3Name = beverage3Name;
    }

    public String getBeverage4Name() {
        return beverage4Name;
    }

    public void setBeverage4Name(String beverage4Name) {
        this.beverage4Name = beverage4Name;
    }

    public String getBeverage5Name() {
        return beverage5Name;
    }

    public void setBeverage5Name(String beverage5Name) {
        this.beverage5Name = beverage5Name;
    }

    public String getKindOfCheese() {
        return kindOfCheese;
    }

    public void setKindOfCheese(String kindOfCheese) {
        this.kindOfCheese = kindOfCheese;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getAgingPeriod() {
        return agingPeriod;
    }

    public void setAgingPeriod(String agingPeriod) {
        this.agingPeriod = agingPeriod;
    }

    public String getTypeOfMilk() {
        return TypeOfMilk;
    }

    public void setTypeOfMilk(String typeOfMilk) {
        TypeOfMilk = typeOfMilk;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getBestUses() {
        return bestUses;
    }

    public void setBestUses(String bestUses) {
        this.bestUses = bestUses;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}