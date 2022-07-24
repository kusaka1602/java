package by.epam.javaonline.step2.matrix;
//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rows = 1 + (int) (Math.random() * 10);
        int columns = 1 + (int) (Math.random() * 10);
        System.out.println("Dimensions: " + rows + "x" + columns);
        int[][] matrix = new int[rows][columns];// m is rows, n is columns

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Choose a row: ");
        int k = console.nextInt();
        for (int j = 0; j < columns; j++){
            System.out.print(matrix[k-1][j] + " ");
        }
        System.out.print("\nChoose a column: ");
        int p = console.nextInt();
        for (int i = 0; i < rows; i++){
            System.out.print(matrix[i][p-1] + " ");
        }
    }
}

