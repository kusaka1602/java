package by.epam.javaonline.step2.matrix;
//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз
public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        int count = 0;
        System.out.println("Matrix: ");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 20; j++){
                matrix[i][j] = (int)(Math.random() * 16);
                System.out.printf("%3d ",matrix[i][j]);
            }
            System.out.println();
        }
        System.out.print("Rows: ");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 20; j++){
                if(matrix[i][j] == 5){
                    count++;
                }
            }
            if(count >= 3){
                System.out.print(i+1 + " ");
            }
        }
    }
}
