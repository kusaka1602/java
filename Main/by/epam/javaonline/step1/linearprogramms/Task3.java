package by.epam.javaonline.step1.linearprogramms;

import java.util.Scanner;

import static java.lang.Math.*;

//Вычислить значение функции (sin(x) + cos(y))/(cos(x)-sin(y)) * tan(xy)
public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("X is equals: ");
        double x = console.nextDouble();

        System.out.print("Y is equals: ");
        double y = console.nextDouble();

        double result = (sin(x) + cos(y))/(cos(x)-sin(y)) * tan(x * y);

        System.out.println("Vector of variables: { " + x + " " + y + " }");
        System.out.println("Function: (sin(x) + cos(y))/(cos(x)-sin(y)) * tan(xy)");
        System.out.println("Result: " +  result);
    }
}
