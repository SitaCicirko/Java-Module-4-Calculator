package com.example.javamodule4calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
class Calculator{
    public void adding(int a, int b){
        System.out.println(a + b);

    }
    public void subtract(int c, int d){
        System.out.println(c - d);
    }
}
public class JavaModule4CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.adding(1,3);
        calculator.subtract(3, 1);
        System.out.println("it works!");
    }
}
