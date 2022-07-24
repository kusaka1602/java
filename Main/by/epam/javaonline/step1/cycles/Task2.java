package by.epam.javaonline.step1.cycles;
//Найти значение кусочной функции на интервале от a до b с шагом h
public class Task2 {
    public static void main(String[] args) {
        double a = -3;
        double b = 6;
        double h = 1;

        for(double x = a;x <= b;x+=h){
            if(x > 2){
                System.out.println("For x equals "+x+" :"+x);
            }
            else{
                System.out.println("For x equals "+x+" :"+ (-1 * x));
            }

        }
    }
}
