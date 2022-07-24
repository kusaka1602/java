package by.epam.javaonline.step2.arrays;
//Дана последовательность целых чисел а1, а2 ....., аn.
//Образовать новую последовательность, выбросив из исходной те члены, которые равны
//min(a1,a2,.....an)
public class Task8 {
    public static void main(String[] args) {
        int length = 1 + (int) (Math.random() * 10);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] =(int) (Math.random() * 11);
        }
        //Filling up an array
        int min = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        int count = 0;
        for (int k : array) {
            if (k == min) {
                count++;
            }
        }
        int[] newArray = new int[length - count];
        int j = 0;
        for (int k : array) {
            if (k != min) {
                newArray[j] = k;
                j++;
            }
        }
        //output
        System.out.print("Original array: ");
        for (int i1 :
                array) {
            System.out.print(i1 + " ");
        }
        System.out.println();
        System.out.print("New array: ");
        for (int i2 :
                newArray) {
            System.out.print(i2 + " ");
        }
    }
}
