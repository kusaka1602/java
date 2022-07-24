package by.epam.javaonline.step2.methods;

public class Task7 {
    public static void main(String[] args) {
        int[] array;
        array = range(1,9,2);
        int sum = 0;
        for(int i : array){
            sum += factorial(i);
            System.out.println(i);
        }
        System.out.println(sum);
    }
    public static long factorial(int a){
        if (a == 1){
            return 1;
        }
        else{
            return a * factorial(a - 1);
        }
    }
    public static int[] range(int start, int end, int step){
        int[] range = new int[end/step + 1];
        range[0] =  start;
        for (int i = 1; i < range.length; i++){
            range[i] = range[i - 1] + step;
        }
        return range;
    }

}
