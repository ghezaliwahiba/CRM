package com.example.demo.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;

     private String type_presta;
     private String designation;
     private short nb_days;
     @Column(name = "unit_price", columnDefinition = "NUMERIC")
     private double unit_price;
     @Column(name = "total_exclude_taxe", columnDefinition = "NUMERIC")
     private double total_exclude_taxe;
     @Column(name = "total_with_taxe", columnDefinition = "NUMERIC")
     private double total_with_taxe;
     private int state;

    @ManyToOne
  //  @JoinColumn(name="client_id")
    private Client client;

    public Order() {
    }
    public Order(String type_presta, String designation, short nb_days, double unit_price, int state) {
        this.type_presta = type_presta;
        this.designation = designation;
        this.nb_days = nb_days;
        this.unit_price = unit_price;
        this.total_exclude_taxe = unit_price*nb_days;
        this.total_with_taxe = unit_price*nb_days*1.2;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType_presta() {
        return type_presta;
    }

    public void setType_presta(String type_presta) {
        this.type_presta = type_presta;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public short getNb_days() {
        return nb_days;
    }

    public void setNb_days(short nb_days) {
        this.nb_days = nb_days;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public double getTotal_exclude_taxe() {
        return total_exclude_taxe;
    }

    public void setTotal_exclude_taxe(double total_exclude_taxe) {
        this.total_exclude_taxe = total_exclude_taxe;
    }
    public double getTotal_with_taxe() {
        return total_with_taxe;
    }
    public void setTotal_with_taxe(double total_with_taxe) {
        this.total_with_taxe = total_with_taxe;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", type_presta='" + type_presta + '\'' +
                ", designation='" + designation + '\'' +
                ", nb_days=" + nb_days +
                ", unit_price=" + unit_price +
                ", total_exclude_taxe=" + total_exclude_taxe +
                ", total_with_taxe=" + total_with_taxe +
                ", state=" + state +
                '}';
    }
}
