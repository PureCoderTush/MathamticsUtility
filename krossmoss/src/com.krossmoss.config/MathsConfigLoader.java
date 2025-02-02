package com.krossmoss.config;

import com.krossmoss.config.MathsConfig;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MathsConfigLoader {
    public static MathsConfig loadFromFile(String filePath) throws IOException {
        Properties properties = new Properties();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            properties.load(reader);
        }

        return new MathsConfig.Builder()
                .setDoSum(Boolean.parseBoolean(properties.getProperty("doSum", "false")))
                .setDoSubtract(Boolean.parseBoolean(properties.getProperty("doSubtract", "false")))
                .setDoMultiply(Boolean.parseBoolean(properties.getProperty("doMultiply", "false")))
                .setDoDivide(Boolean.parseBoolean(properties.getProperty("doDivide", "false")))
                .setCalFactorial(Boolean.parseBoolean(properties.getProperty("calFactorial", "false")))
                .setDoLCM(Boolean.parseBoolean(properties.getProperty("doLCM", "false")))
                .setDoHCF(Boolean.parseBoolean(properties.getProperty("doHCF", "false")))
                .build();
    }
}
