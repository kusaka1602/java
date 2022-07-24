package by.epam.javaonline.step2.arrays;
//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class Task5 {
    public static void main(String[] args) {
        int[]array = {2,3,4,5,1,2,3,4,7,10};
        for(int i = 0; i < array.length;i++){
            if(array[i] > i){
                System.out.print(array[i] + "  ");
            }
        }
    }
}
