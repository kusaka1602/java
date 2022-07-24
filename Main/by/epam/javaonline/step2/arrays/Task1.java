package by.epam.javaonline.step2.arrays;
//В массив N занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
public class Task1 {
    public static void main(String[] args) {
        int[] nums = {1,243,345,123,23,54,12,2,2,769,0};
        int k = 2;
        int sum = 0;
        for (int num : nums) {
            if (num % k == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}