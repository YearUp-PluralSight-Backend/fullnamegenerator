package com.pluralsight;


import java.util.Scanner;

public class AddressBuilder {

    private String name;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String billingAddress;
    private String shippingAddress;


    public AddressBuilder() {
    }

    public AddressBuilder(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

    }



    public void setBillingAddress() {
        StringBuilder address = new StringBuilder("BillingAddress:\n");
        this.billingAddress = address.append(this.street + "\n").append(this.city + ", ").append(this.state + " ").append(this.zipCode).toString();
    }

    public void setShippingAddress() {
        StringBuilder address = new StringBuilder("ShippingAddress:\n");
        this.shippingAddress = address.append(this.street + "\n").append(this.city + ", ").append(this.state + " ").append(this.zipCode).toString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return  this.name + "\n\n" + billingAddress  + "\n\n" + shippingAddress;
    }
}
