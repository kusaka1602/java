package by.epam.javaonline.step2.methods;
//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:

public class Task1 {
        public static void main(String[] args) {
                System.out.println(greatestCommonDivider(15,35));
                System.out.println(leastCommonMultiple(15,35));
        }
        public static int greatestCommonDivider(int a, int b){
           if (a < b){
                   int temp = a;
                   a = b;
                   b = temp;
           }
           int r = a % b;
           while (r != 0){
                a = b;
                b = r;
                r = a%b;
           }
           return b;
        }
        public static int leastCommonMultiple(int a, int b){
                return (a * b)/greatestCommonDivider(a,b);
        }
}
