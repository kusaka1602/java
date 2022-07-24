package by.epam.javaonline.step1.linearprogramms;

//Дано вещественное число в формате aaa.bbb преобразовать в число вида bbb.aaa
public class Task4 {
    public static void main(String[] args) {
        double r = 123.456;

        double newIntegerPart = (r - (int) r) * 1000;
        double newFractPart = (int) r * 0.001;

        double reversedR = newIntegerPart + newFractPart ;

        System.out.println("Number is: " +  r);
        System.out.printf("Reversed number is: %.3f%n", reversedR);
    }
}
