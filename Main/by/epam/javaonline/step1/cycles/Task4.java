package by.epam.javaonline.step1.cycles;

import java.math.BigInteger;
//Найти произведение квадратов первых двухста чисел
public class Task4 {
    public static void main(String[] args) {
        long product = 1;
        for(int i = 2;i <= 200;i++){
            product *= Math.pow(i,2);
            if(product >= Integer.MAX_VALUE){
                System.out.println("Overflowing Int");
                System.out.println(product);
            }
            if(product == Long.MAX_VALUE){
                System.out.println("Overflowing Long");
                break;
            }

        }
        System.out.println(product);
    }
}
