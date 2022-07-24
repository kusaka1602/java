package by.epam.javaonline.step1.linearprogramms;

import java.util.Scanner;

//Найдите значение функции z = ((a - 3) * b / 2) + c
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("A is equals: ");
        double a = console.nextDouble();

        System.out.print("B is equals: ");
        double b = console.nextDouble();

        System.out.print("C is equals: ");
        double c = console.nextDouble();

        double result = ((a - 3) * b/2) + c;

        System.out.println(result);

    }
}
