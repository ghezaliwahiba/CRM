package com.example.demo.model;
import jakarta.persistence.*;
@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    private String company_name;
    private String ﬁrst_name;
    private String last_name;
    private String email;
    private String phone;
    private String address;
    private String zip_code;
    private String city;
    private String country;
    private int state;


    public Client() {
    }

    public Client(String company_name, String ﬁrst_name, String last_name, String email, String phone, String address, String zip_code, String city, String country, int state) {
        this.company_name = company_name;
        this.ﬁrst_name = ﬁrst_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.zip_code = zip_code;
        this.city = city;
        this.country = country;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getﬁrst_name() {
        return ﬁrst_name;
    }

    public void setﬁrst_name(String ﬁrst_name) {
        this.ﬁrst_name = ﬁrst_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", ﬁrst_name='" + ﬁrst_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", state=" + state +
                '}';
    }
}
