package com.example.demo.controller;

import com.example.demo.model.Client;

import java.math.BigDecimal;

public class OrderDTO {
    private String typePresta;
    private String designation;
    private short nbDays;
    private double unitPrice;
    private double totalExcludeTaxe;
    private double totalWithtaxe;
    private String state;
    private Client client;

    public String getTypePresta() {
        return typePresta;
    }

    public void setTypePresta(String typePresta) {
        this.typePresta = typePresta;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public short getNbDays() {
        return nbDays;
    }

    public void setNbDays(short nbDays) {
        this.nbDays = nbDays;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalExcludeTaxe() {
        return totalExcludeTaxe;
    }

    public void setTotalExcludeTaxe(double totalExcludeTaxe) {
        this.totalExcludeTaxe = totalExcludeTaxe;
    }

    public double getTotalWithtaxe() {
        return totalWithtaxe;
    }

    public void setTotalWithtaxe(double totalWithtaxe) {
        this.totalWithtaxe = totalWithtaxe;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
