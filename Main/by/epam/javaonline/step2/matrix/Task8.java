package by.epam.javaonline.step2.matrix;
//В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rows = 1 + (int)(Math.random() * 10);
        int columns = 1 + (int)(Math.random() * 10);
        int[][]matrix = new int[rows][columns];
        System.out.println("Original matrix: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int)(Math.random()*10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Source column: ");
        int sourceColumn = console.nextInt();
        System.out.print("Destination column: ");
        int destinationColumn = console.nextInt();
        for (int i = 0; i < rows; i++){
            int temp =  matrix[i][sourceColumn -1];
            matrix[i][sourceColumn - 1] = matrix[i][destinationColumn - 1];
            matrix[i][destinationColumn - 1] = temp;
        }
        System.out.println("\nFinal matrix: ");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

