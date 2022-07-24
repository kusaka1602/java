package by.epam.javaonline.step2.matrix;
//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task6 {
    public static void main(String[] args) {
        int n = 2 + 2 * (int) (Math.random() * 5);
        System.out.println("\"n\" is equals: " + n);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            if(i < n/2){
                for (int j = i; j < n - i; j++) {
                    matrix[i][j] = 1;
                }
            }
            else {
                for(int j = n - i - 1; j < i + 1;j++){
                    matrix[i][j] = 1;
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
