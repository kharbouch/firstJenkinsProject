package com.example;

/**
 * Application principale
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("Hello Jenkins Pipeline!");
        
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("5 * 6 = " + calc.multiply(5, 6));
    }
    
    public String getGreeting() {
        return "Hello from Jenkins!";
    }
}
