package com.spotify.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    public static Properties loadProperties(String filePath) {
        Properties properties = new Properties();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(new BufferedReader(new FileReader(filePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;

    }
}
