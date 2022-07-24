package by.epam.javaonline.step2.methods;

import static by.epam.javaonline.step2.methods.Task1.greatestCommonDivider;
public class Task6 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++ ){
            for (int j = 1; j < 11; j++){
                for (int k = 1; k < 11; k++) {
                    System.out.println(i + " " + j + " " + k + " " +  isCoprime(i,j,k));
                }
            }
        }
    }
    public static boolean isCoprime(int a, int b, int c){
        return greatestCommonDivider(greatestCommonDivider(a, b), c) == 1;
    }
}
