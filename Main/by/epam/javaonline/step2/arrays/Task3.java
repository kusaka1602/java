package by.epam.javaonline.step2.arrays;
//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.
public class Task3 {
    public static void main(String[] args) {
        double[]array = {0,1,0,1,3,-3,-4,67,9.2};
        int length = array.length;
        int negative = 0;
        int zero = 0;
        int positive;
        for (double element : array) {
            if (element < 0) {
                negative++;
            } else if (element == 0) {
                zero++;
            }
        }
        positive = length - negative - zero;
        System.out.println("Less than zero: " + negative);
        System.out.println("Zero: " + zero);
        System.out.println("More than zero: " + positive);
    }
}
