package by.epam.javaonline.step2.arrays;
//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.
public class Task6 {
    public static void main(String[] args){
        boolean isPrime;
        double sum = 0;
        int length = 1 + (int)(Math.random() * 10);//from 1 to 10
        float[] array = new float[length];
        for(int i = 0; i < array.length;i++){
            array[i] = (float) Math.random() * 11;
        }//Filling up an array with n random natural numbers
        for(int i = 0; i < array.length;i++){
            isPrime = true;
            for(int j = 2; j < i+1;j++){
                if((i+1)%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum+=array[i];
            }
        }
        //
        System.out.println("Length: " + length);
        System.out.print("Array: ");
        for(double i: array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Summa: " + sum);
    }
}
