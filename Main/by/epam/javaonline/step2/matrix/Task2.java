package by.epam.javaonline.step2.matrix;
//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {
    public static void main(String[] args) {
        int dimension = 1 + (int)(Math.random() * 10);
        int[][] matrix = new int[dimension][dimension];// m is dimension of square matrix
        System.out.println("Dimensions: " + dimension + "x" + dimension);
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matrix: ");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < dimension ; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
//        System.out.println("secondary diagonal: ");
//        for (int i = 0, j = m - 1; i < m ; i++,j--){
//            System.out.print(matrix[i][j] + " ");
//
//        }
    }
}
