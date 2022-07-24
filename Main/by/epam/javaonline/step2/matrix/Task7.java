package by.epam.javaonline.step2.matrix;

import static java.lang.Math.*;

//Сформировать матрицу в которой a[i][j] = sin(i^2 + j^2)/n
public class Task7 {
    public static void main(String[] args) {
        int n = 1 + (int) (Math.random() * 10);
        System.out.println("\"n\" is equals: " + n);
        double[][] matrix = new double[n][n];
        int posCounter = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = sin(pow(i+1,2) +pow(j+1,2))/(double)n;
                if(matrix[i][j] > 0){
                    posCounter++;
                }
            }
        }
        System.out.println("Matrix: ");
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.printf("%5.2f  ",element);
            }
            System.out.println();
        }
        System.out.println("More than zero(without zero): " + posCounter);
    }
}
