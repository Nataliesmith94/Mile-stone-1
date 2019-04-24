package com.company;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {

    public static void writeToTxtFile(List<Profile> profiles) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new java.io.FileWriter("profile1.txt", true));
        bufferedWriter.write(profiles.toString());
        bufferedWriter.close();
    }

    public static void writeToTxtFileV2(List<Profile> profiles) {
        try {
            FileWriter writer = new java.io.FileWriter("profile.txt", true);
            writer.write(profiles.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToJSONFIle(Profile profile, int i) throws IOException {
        String fileName = "Profile " + i + ".json";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(fileName), profile);
    }

}
