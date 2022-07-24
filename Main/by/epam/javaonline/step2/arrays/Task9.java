package by.epam.javaonline.step2.arrays;
//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
public class Task9 {
    public static void main(String[] args){
        int length = 1 + (int)(Math.random() * 10);
        int[]array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int)(Math.random() * 11);
        }
        //Filling up an array
        int mode = array[0];
        int amount = 1;
        for (int i = 0; i < length ; i++) {
            int tmpAmount = 1;
            for (int j = i+1; j < length ; j++){
                if(array[i] == array[j]){
                    tmpAmount++;
                }
            }
            if(tmpAmount > amount){
                mode = array[i];
                amount = tmpAmount;
            }
            else if(tmpAmount == amount){
                if(array[i] < mode){
                    mode = array[i];
                }
            }
        }
        //output
        System.out.print("Array: ");
        for (int i: array) {
            System.out.print(i + "  ");
        }
        System.out.print('\n' + "Mode: " + mode);

    }
}

