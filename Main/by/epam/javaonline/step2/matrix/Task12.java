package by.epam.javaonline.step2.matrix;

public class Task12 {
    public static void main(String[] args) {
        int m = (int)(Math.random()*10);
        int n = (int)(Math.random()*10);
        int matrix[][] = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.random()*10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                int min = matrix[i][j];
                int index = j;
                for (int k = j + 1; k < n ; k++) {
                    if(matrix[i][k] < min){
                        min = matrix[i][k];
                        index = k;
                    }
                }
                int temp = matrix[i][j];
                matrix[i][j] = min;
                matrix[i][index] = temp;
            }
        }
        System.out.println();
        for (int[]row:
                matrix) {
            for (int num:
                    row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

