package com.dogan.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {

    static Properties properties;
    static {
        String path = "configuration.properties";


        properties = new Properties();
        try {

            FileInputStream file = new FileInputStream(path);
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

            public static String getProperty(String key){

                return properties.getProperty(key);
 }


}
