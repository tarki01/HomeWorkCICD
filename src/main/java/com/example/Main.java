package com.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("Калькулятор запущен!");
        System.out.println("5 + 3 = " + calculator.add(5, 3));
        System.out.println("10 - 4 = " + calculator.subtract(10, 4));
        System.out.println("6 * 7 = " + calculator.multiply(6, 7));
        System.out.println("15 / 3 = " + calculator.divide(15, 3));
        System.out.println("Число 8 четное? " + calculator.isEven(8));
    }
}
