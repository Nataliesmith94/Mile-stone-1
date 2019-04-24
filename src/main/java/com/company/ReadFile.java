package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {

    public void readInCsvFile(String fileName) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName)); //Reading in file

            ArrayList<Profile> profileArrayList = readingFileToArray(",", bufferedReader); //Read in files to array list

            for (int i = 0; i < profileArrayList.size(); i++) {

                Profile profile = profileArrayList.get(i); //Get each file and save it to its own json file
                WriteFile.writeToJSONFIle(profile, i);
                bufferedReader.close();
                System.out.println(profile);
            }
            System.out.println("Finished saving files!!!!!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static ArrayList<Profile> readingFileToArray(String commaSplitter, BufferedReader bufferedReader) throws IOException{
        String line = " ";
        bufferedReader.readLine();

        ArrayList<Profile> profileArrayList = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null) {
            String[] profileInfo = line.split(commaSplitter);
            Profile profile = profileBuilder(profileInfo);
            profileArrayList.add(profile);
        }
        return profileArrayList;
    }


    public static Profile profileBuilder(String[] profileInfo) {
        Profile profile = null;

        if(profileInfo.length == 11) {
            try {
                Address address = new Address(Integer.parseInt(profileInfo[2]), profileInfo[3], profileInfo[4], profileInfo[5], profileInfo[6]);
                CarDetails carDetails = new CarDetails(profileInfo[7], profileInfo[8], profileInfo[9], Double.parseDouble(profileInfo[10]));
                profile = new Profile(profileInfo[0], profileInfo[1], address, carDetails);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Format");
            }
        }
        else {
            System.out.println("Missing Data");
        }
        return profile;
    }
}



