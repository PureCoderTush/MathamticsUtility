import com.krossmoss.config.AreithmaticOperations;
import com.krossmoss.config.MathsConfig;
import com.krossmoss.config.MathsConfigLoader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Error: Please provide a configuration file path as an argument.");
            System.exit(1);
        }

        String filePath = args[0];
        try {
            MathsConfig config = MathsConfigLoader.loadFromFile(filePath);
            System.out.println("Loaded Configuration: " + config);
        } catch (IOException e) {
            System.err.println("Error reading configuration file: " + e.getMessage());
            System.exit(1);
        }

        AreithmaticOperations.perform();
    }




}