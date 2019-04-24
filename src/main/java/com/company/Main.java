package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        readFile.readInCsvFile("ReadMe.csv");
    }


    public static List<Profile> createProfiles() {
        Address address1 = new Address(1, "Donalds Way", "Aigburth", "Liverpool", "L17 0EN");
        Address address2 = new Address(2, "Donalds Way", "Aigburth", "Liverpool", "L17 0EN");
        Address address3 = new Address(3, "Donalds Way", "Aigburth", "Liverpool", "L17 0EN");

        CarDetails carDetails1 = new CarDetails("000 aaa", "BMW", "X5", 2.1);
        CarDetails carDetails2 = new CarDetails("111 BBB", "BMW", "X5", 2.1);
        CarDetails carDetails3 = new CarDetails("222 CCC", "BMW", "X5", 2.1);

        Profile profile1 = new Profile("hahah", "Smith", address1, carDetails1);
        Profile profile2 = new Profile("Adam", "Smith", address2, carDetails2);
        Profile profile3 = new Profile("Diane", "Smith", address3, carDetails3);

        List<Profile> profileList = new ArrayList<>();
        profileList.add(profile1);
        profileList.add(profile2);
        profileList.add(profile3);

        return profileList;
    }
}
