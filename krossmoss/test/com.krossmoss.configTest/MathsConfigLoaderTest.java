package com.krossmoss.configTest;

import com.krossmoss.config.MathsConfig;
import com.krossmoss.config.MathsConfigLoader;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.IOException;

public class MathsConfigLoaderTest {
    @org.junit.Test
    public void testLoadFromFile() throws IOException {
        // Load config from the file
        MathsConfig config = MathsConfigLoader.loadFromFile("krossmoss/resources/configTest/mathsConfig.txt");

        // Assertions to verify config values
        assertTrue(config.doSum);
        assertFalse(config.doSubtract);
        assertTrue(config.doMultiply);
        assertFalse(config.doDivide);
        assertTrue(config.calFactorial);
        assertTrue(config.doLCM);
        assertFalse(config.doHCF);
    }
}
