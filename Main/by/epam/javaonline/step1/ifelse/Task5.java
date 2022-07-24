package by.epam.javaonline.step1.ifelse;
import static java.lang.Math.*;
//Найти значение кусочной функции
public class Task5 {
    public static void main(String[] args) {
        double x = 3.04;

        if (x <=3){
            System.out.println(pow(x,2) -3 * x + 9);
        }
        else{
            System.out.println(1/(pow(x,3) + 6));
        }
    }
}