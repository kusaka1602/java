package by.epam.javaonline.step1.cycles;

//Найти сумму первых n чисел
public class Task1 {
    public static void main(String[] args) {
        int input = 10;

        int summa = 0;
        for (int i = 1; i <= input; i++){
            summa +=i;
        }
        System.out.println(summa);
    }
}
