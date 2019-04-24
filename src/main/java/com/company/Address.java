package com.company;

public class Address {

    public int houseNumber;
    public String street;
    public String town;
    public String city;
    public String postcode;

    public Address(int houseNumber, String street, String town, String city, String postcode) {
        setHouseNumber(houseNumber);
        setStreet(street);
        setTown(town);
        setCity(city);
        setPostcode(postcode);
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "\n Address: " + getHouseNumber() + getStreet() + getTown() + getCity() + getPostcode();
    }

}
