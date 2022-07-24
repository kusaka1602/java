package by.epam.javaonline.step2.matrix;
// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task5 {
    public static void main(String[] args) {
        int n = 2 + (int) (Math.random() * 4) * 2;
        System.out.println("\"n\" is equals: " + n);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i; j++) {
                matrix[i][j] = i+1;
            }
        }
        System.out.println("Matrix: ");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
