package com.krossmoss.config;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class AreithmaticOperations {
        public static void perform() {
            // Read data from the file
            try (BufferedReader br = new BufferedReader(new FileReader("E:\\MathamticsUtility\\krossmoss\\resources\\configTest\\containDigits.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // Split each line to get operation and values
                    String[] parts = line.split(" = ");
                    String operation = parts[0].trim();
                    String[] values = parts[1].split(",");

                    // Perform operation based on the type
                    switch (operation) {
                        case "doSum":
                            performSum(values);
                            break;
                        case "doSubtract":
                            performSubtract(values);
                            break;
                        case "doMultiply":
                            performMultiply(values);
                            break;
                        case "doDivide":
                            performDivide(values);
                            break;
                        case "calFactorial":
                            performFactorial(values[0]);
                            break;
                        case "doLCM":
                            performLCM(values);
                            break;
                        case "doHCF":
                            performHCF(values);
                            break;
                        default:
                            System.out.println("Unknown operation: " + operation);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Sum operation
        private static void performSum(String[] values) {
            int sum = 0;
            for (String value : values) {
                sum += Integer.parseInt(value.trim());
            }
            System.out.println("Sum: " + sum);
        }

        // Subtract operation
        private static void performSubtract(String[] values) {
            int result = Integer.parseInt(values[0].trim());
            for (int i = 1; i < values.length; i++) {
                result -= Integer.parseInt(values[i].trim());
            }
            System.out.println("Subtraction result: " + result);
        }

        // Multiply operation
        private static void performMultiply(String[] values) {
            int result = 1;
            for (String value : values) {
                result *= Integer.parseInt(value.trim());
            }
            System.out.println("Multiplication result: " + result);
        }

        // Divide operation
        private static void performDivide(String[] values) {
            int result = Integer.parseInt(values[0].trim());
            for (int i = 1; i < values.length; i++) {
                result /= Integer.parseInt(values[i].trim());
            }
            System.out.println("Division result: " + result);
        }

        // Factorial operation
        private static void performFactorial(String value) {
            int num = Integer.parseInt(value.trim());
            System.out.println("Factorial of " + num + ": " + factorial(num));
        }

        // Factorial calculation
        private static BigInteger factorial(int n) {
          //  int result = 1;
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result =result.multiply(BigInteger.valueOf(i));

            }
            return result;
        }

        // LCM operation
        private static void performLCM(String[] values) {
            int[] nums = Arrays.stream(values).mapToInt(v -> Integer.parseInt(v.trim())).toArray();
            System.out.println("LCM: " + lcm(nums));
        }

        // LCM calculation
        private static int lcm(int[] nums) {
            int result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result = lcm(result, nums[i]);
            }
            return result;
        }

        private static int lcm(int a, int b) {
            return (a * b) / gcd(a, b);
        }

        // HCF operation
        private static void performHCF(String[] values) {
            int[] nums = Arrays.stream(values).mapToInt(v -> Integer.parseInt(v.trim())).toArray();
            System.out.println("HCF: " + hcf(nums));
        }

        // HCF calculation
        private static int hcf(int[] nums) {
            int result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result = hcf(result, nums[i]);
            }
            return result;
        }

        private static int hcf(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    }


