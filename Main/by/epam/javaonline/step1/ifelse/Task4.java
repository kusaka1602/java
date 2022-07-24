package by.epam.javaonline.step1.ifelse;

public class Task4 {
   /* A,B - размеры прямоугольного отверстия
    x,y,z - измерения кирпича
    проверить проходит ли кирпич через отверстие  */
    public static void main(String[] args) {
        double x = 4;
        double y = 3;
        double z = 3;

        double A = 2;
        double B = 3;

        if((x <= A && y <= B)||(x <= B && y <=A)){
            System.out.println("This break is suitable");
        }
        else if ((x <= A && z <= B)||(x <= B && z <= A)){
            System.out.println("This break is suitable");
        }
        else if((y <= A && z <= B)||(y <= B && z <=A)){
            System.out.println("This break is suitable");
        }
        else{
            System.out.println("This break isn't suitable");
        }
    }
}
