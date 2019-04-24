package com.company;

public class CarDetails {

    private String carRegistration;
    private String carMake;
    private String carModel;
    private double carEngineSize;

    public CarDetails(String carRegistration, String carMake, String carModel, double carEngineSize ) {
        setCarRegistration(carRegistration);
        setCarMake(carMake);
        setCarModel(carModel);
        setCarEngineSize(carEngineSize);
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getCarEngineSize() {
        return carEngineSize;
    }

    public void setCarEngineSize(double carEngineSize) {
        this.carEngineSize = carEngineSize;
    }

    @Override
    public String toString() {
        return "\n Car Details:" + getCarRegistration() + getCarMake() + getCarModel() + getCarEngineSize();
    }
}
