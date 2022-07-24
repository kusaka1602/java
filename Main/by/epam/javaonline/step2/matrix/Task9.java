package by.epam.javaonline.step2.matrix;
//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.
public class Task9 {
    public static void main(String[] args) {
        int rows = 1 + (int)(Math.random() * 10);
        int columns = 1 + (int)(Math.random() * 10);
        System.out.println("Dimensions: " + columns + "x" + rows);
        int[][]matrix = new int[rows][columns];
        int[]sums = new int[columns];
        System.out.println("Matrix: ");
        for (int i = 0; i < rows ; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = (int)(Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int temp = 0;
        int columnNum = 0;
        for (int j = 0; j < columns; j++){
            for (int i = 0; i < rows; i++){
                sums[j]+=matrix[i][j];
            }
            if(sums[j] > temp){
                temp = sums[j];
                columnNum = j+1;
            }
        }
        for (int[]row: matrix) {
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int num:
                sums){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(columnNum);
    }
}
