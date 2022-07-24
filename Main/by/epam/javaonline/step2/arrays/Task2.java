package by.epam.javaonline.step2.arrays;
// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.
public class Task2 {
    public static void main(String[] args) {
        double[]array = {2.3435,23.32565,234.345,3,12.0,123};
        System.out.print("Start array: ");
        for(double el: array){
            System.out.print(el + " ");
        }
        System.out.println();
        double Z = Math.PI;
        int counter = 0;
        System.out.print("End array: ");
        for(int i = 0; i < array.length; i++){
            if(array[i] > Z){
                array[i] = Z;
                counter++;
            }
            System.out.print(array[i] + "   ");
        }
        System.out.println();
        System.out.print("Number of permutations: " + counter);
    }
}
