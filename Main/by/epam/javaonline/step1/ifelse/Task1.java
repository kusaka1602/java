package by.epam.javaonline.step1.ifelse;
//По двум заданным углам определить существует ли треугольник
//Если существует, то проверить является ли он прямым
public class Task1 {
    public static void main(String[] args) {
        double angle1 = 90;
        double angle2 = 45;

        if (angle1 + angle2 < 180) {
            System.out.println("Triangle is exist");
            if ((angle1 + angle2) == 90 || angle1 == 90 || angle2 == 90) {
                System.out.println("The triangle is rectangular");
            }
        } else {
            System.out.println("Triangle isn't exist");
        }
    }
}
