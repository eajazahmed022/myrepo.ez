package com.example;

import java.util.Scanner;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator();

        System.out.println("Sum: " + calculator.sum(num1, num2));
        System.out.println("Subtract: " + calculator.subtract(num1, num2));
        System.out.println("Multiply: " + calculator.multiply(num1, num2));
        System.out.println("Divide: " + calculator.divide(num1, num2));

        scanner.close();
    }
}
