package by.epam.javaonline.step2.arrays;
//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Task4 {
    public static void main(String[] args) {
        double[]array = {-100,100,3,4,-6,120,7,12,-609,23};
        System.out.print("Start array: ");
        for(double element:array){
            System.out.print(element + " ");
        }
        System.out.println();
        //print
        int length = array.length;
        double greatest = array[0];
        double least = array[0];
        int greatestIndex = 0;
        int leastIndex = 0;
        for (int i = 1; i < length;i++ ){
            if(array[i] > greatest){
                greatest = array[i];
                greatestIndex = i;
            }
            else if(array[i] < least){
                least = array[i];
                leastIndex = i;
            }
        }
        array[greatestIndex] = least;
        array[leastIndex] = greatest;
        //print
        System.out.print("End array: ");
        for (double d:array) {
            System.out.print(d + " ");

        }
    }

}