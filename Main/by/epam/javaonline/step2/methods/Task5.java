package by.epam.javaonline.step2.methods;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,5,6,10,10,10,7,7};
        int max = getMax(array);
        array = delete(max, array);
        System.out.println(getMax(array));
    }
    public static int getMax(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static int[] delete(int a, int[] array){
        int[] newArray;
        int length = array.length;
        for (int k : array) {
            if (k == a) {
                length--;
            }
        }
        newArray = new int[length];
        int j = 0;
        for (int i = 0; i < length;i++,j++){
            if(array[j] != a){
                newArray[i] = array[j];
            }
            else{
                i--;
            }
        }
       return newArray;
    }
}
