package by.epam.javaonline.step2.arrays;
//Даны действительные числа а1,а2....а2n. Найти:
//max(a1+a2n,a2+(a2n-1)......an+(an+1))
public class Task7 {
    public static void main(String[] args) {
        int length = 2 + ((int)(Math.random() * 5))*2;//from 2 to 10
        double[] array = new double[length];
        double[] compressedArray = new double[length/2];
        for(int i = 0; i < array.length;i++){
            array[i] = Math.random() * 11;
        }//Filling up an array with n random natural numbers(n is even)


        for (int i = 0; i < length/2; i++){
            compressedArray[i] = array[i] + array[array.length - i - 1];
        }
        double max = compressedArray[0];
        for (int i = 1; i < compressedArray.length; i++){
            if(compressedArray[i] > max){
                max = compressedArray[i];
            }
        }
        //output
        System.out.print("Original array: ");
        for (double d1: array) {
            System.out.print(d1 + "  ");
        }
        System.out.println();
        System.out.print("Compressed array: ");
        for (double d2:
                compressedArray) {
            System.out.print(d2 + "  ");
        }
        System.out.println();
        System.out.println("Maximum of compressed array: " + max);
    }
}
