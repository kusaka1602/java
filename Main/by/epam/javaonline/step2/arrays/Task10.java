package by.epam.javaonline.step2.arrays;
//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
// элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Task10 {
    public static void main(String[] args) {
        int length = 1 + (int)(Math.random() * 10);
        int[]array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int)(Math.random() * 10) + 1;
        }
        System.out.print("Original array: ");
        for (int i1: array) {
            System.out.print(i1 + "  ");
        }

        int j = 0;
        for (int i = 0; i < length; i+=2) {
            array[j] = array[i];
            j++;
        }
        for (int i = (length+1)/2; i < length ; i++) {
            array[i] = 0;
        }
        System.out.print("\nEdited array: ");
        for (int i1: array) {
            System.out.print(i1 + "  ");
        }
    }
}
