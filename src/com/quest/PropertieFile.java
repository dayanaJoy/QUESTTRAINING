package com.quest;

import java.io.*;
import java.util.Properties;

public class PropertieFile {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
            properties.setProperty("database.url", "jdbc:mysql://localhost:3306/mydb");
            properties.setProperty("database.user", "root");
            properties.setProperty("database.password", "password");
            //save properties in file
            try {
                FileOutputStream fos = new FileOutputStream("config.properties");
                properties.store(fos, "Database Configuration");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //load properties in file
        Properties loadproperties = new Properties();
            try{
                loadproperties.load(new FileInputStream("config.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
}
