package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReadFileTest {

    @Test
    public void spiltingArrayToBuildProfile() {
        //Arrange
        Address address1 = new Address(1, "Donalds Way", "Aigburth", "Liverpool", "L17 0EN");
        CarDetails carDetails1 = new CarDetails("000 aaa", "BMW", "X5", 2.1);
        Profile newProfile = new Profile("Natalie", "Smith", address1, carDetails1);

        String[] testProfile = {"Natalie", "Smith", "1", "Donalds Way", "Aigburth", "Liverpool", "L17 0EN", "000 aaa", "BMW", "X5", "2.1"};

        //Act
        ReadFile readFile = new ReadFile();
        Profile profileResult = readFile.profileBuilder(testProfile);

        //Assert
        assertEquals(profileResult.getFirstName(), newProfile.getFirstName());
        assertEquals(profileResult.getSecondName(), newProfile.getSecondName());
        assertEquals(profileResult.getAddress().houseNumber, newProfile.getAddress().getHouseNumber());
        assertEquals(profileResult.getCarDetails().getCarEngineSize(), newProfile.getCarDetails().getCarEngineSize());
    }

    @Test
    public void testingNullErrorsWhenMissingData() {
        String[] testProfile = {"Natalie", "Smith", "1", "Donalds Way", "Aigburth", "Liverpool", "L17 0EN", "000 aaa", "BMW", "X5"};

        ReadFile readFile = new ReadFile();
        Profile profileResult = readFile.profileBuilder(testProfile);

        assertNull(profileResult);
    }

    @Test
    public void testingNullErrorsWhenNoNumbersEntered() {
        String[] testProfile = {"Natalie", "Smith", "test", "Donalds Way", "Aigburth", "Liverpool", "L17 0EN", "000 aaa", "BMW", "X5"};

        ReadFile readFile = new ReadFile();
        Profile profileResult = readFile.profileBuilder(testProfile);

        assertNull(profileResult);
    }

}