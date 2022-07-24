package by.epam.javaonline.step1.cycles;

import static java.lang.Math.pow;
//Найти сумму элементов числового ряда (общий элемент a n-ое = 1/2^n + 1/3^n) которые меньше заданного e
public class Task5 {
    public static void main(String[] args) {
        double e = 0.00000001;

        double element = 2;// 1/2^0 + 1/3^0
        double summa = 0;
        for (int i = 1; element >= e ; i++) {
            summa+= element;
            element = 1/pow(2,i) + 1/pow(3,i);
        }
        System.out.println(summa);
    }
}
