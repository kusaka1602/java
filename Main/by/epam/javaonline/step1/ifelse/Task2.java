package by.epam.javaonline.step1.ifelse;

import java.util.Scanner;

import static java.lang.Math.*;
//Найти max(min(a,b),min(c,d))
public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 3;
        int d = 1;

        double result = max(min(a,b),min(c,d));

        System.out.printf("max(min(%d,%d),min(%d,%d)) = ",a,b,c,d);
        System.out.println(result);
    }
}
