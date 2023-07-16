package com.epam.mjc.io;

import java.io.File;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        // Get the file path within the resources folder
        String filePath = "Profile.txt";

        // Get the URL of the resource file
        URL resourceUrl = Main.class.getClassLoader().getResource(filePath);
        if (resourceUrl == null) {
            System.out.println("File not found: " + filePath);
            return;
        }

        // Create a File object using the resource URL
        File file = new File(resourceUrl.getFile());

        // Use the FileReader class to read data from the file
        FileReader fileReader = new FileReader();
        Profile profile = fileReader.getDataFromFile(file);

        // Print the profile data
        System.out.println("Name: " + profile.getName());
        System.out.println("Age: " + profile.getAge());
        System.out.println("Email: " + profile.getEmail());
        System.out.println("Phone: " + profile.getPhone());
    }
}
