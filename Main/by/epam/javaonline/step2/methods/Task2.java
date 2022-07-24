package by.epam.javaonline.step2.methods;
// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
import static by.epam.javaonline.step2.methods.Task1.greatestCommonDivider;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(gcd4(24,28,18,8));
    }
    public static int gcd4(int a, int b, int c, int d){
        return greatestCommonDivider(greatestCommonDivider(a,b), greatestCommonDivider(c,d));
    }
}
