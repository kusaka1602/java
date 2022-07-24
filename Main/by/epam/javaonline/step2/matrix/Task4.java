package by.epam.javaonline.step2.matrix;
// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task4 {
    public static void main(String[] args) {
        int n = 2 + (int)(Math.random() * 4) * 2;
        System.out.println("\"n\" is equals: " + n);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if(i%2 == 1){
                    matrix[i][j] = n - j;
                }
                else{
                    matrix[i][j] = j + 1;
                }
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
