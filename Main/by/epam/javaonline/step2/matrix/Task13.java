package by.epam.javaonline.step2.matrix;

public class Task13 {
    public static void main(String[] args) {
        int m = (int)(Math.random()*10);
        int n = (int)(Math.random()*10);
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.random()*10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++){
                int min = matrix[i][j];
                int index = i;
                for (int k = i + 1; k < m ; k++) {
                    if(matrix[k][j] < min){
                        min = matrix[k][j];
                        index = k;
                    }
                }
                int temp = matrix[i][j];
                matrix[i][j] = min;
                matrix[index][j] = temp;
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

