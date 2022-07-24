package by.epam.javaonline.step2.methods;
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.
public class Task3 {
    public static void main(String[] args) {
        System.out.println(areaHexagon(16));
    }
    public static double areaTriangle(double side){
        return (Math.sqrt(3)/4f) * Math.pow(side,2);
    }
    public static double areaHexagon(double side){
        return 6 * areaTriangle(side);
    }
}
