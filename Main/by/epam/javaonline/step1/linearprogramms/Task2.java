package by.epam.javaonline.step1.linearprogramms;

import java.util.Scanner;
import static java.lang.Math.*;

//Вычислить значение выражения по формуле: (b + sqrt(b^2 + 4ac))/2a - a^3*c + b^-2
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("A is equals: ");
        double a = console.nextDouble();

        System.out.print("B is equals: ");
        double b = console.nextDouble();

        System.out.print("C is equals: ");
        double c = console.nextDouble();

        double function = ((b + sqrt(pow(b,2) + 4 * a * c ))/2 * a) + pow(a,3)*c + pow(b,-2);

        System.out.println("Vector of variables: " + "{ " + a + " " + b + " " + c + " " + "}");
        System.out.println("Function: (b + sqrt((b^2) + 4ac))/2a - (a^3)*c + b^-2 ");
        System.out.println("Result: " + function);
    }
}
