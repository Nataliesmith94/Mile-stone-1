
package com.company;
public class Profile {

    private String firstName;
    private String secondName;
    private Address address;
    private CarDetails carDetails;

    public Profile(String firstName, String secondName, Address address, CarDetails carDetails) {
        setFirstName(firstName);
        setSecondName(secondName);
        setAddress(address);
        setCarDetails(carDetails);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public CarDetails getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(CarDetails carDetails) {
        this.carDetails = carDetails;
    }

    @Override
    public String toString() {
        return "Profile:" + getFirstName() + getSecondName() + getAddress() + getCarDetails();
    }
}
