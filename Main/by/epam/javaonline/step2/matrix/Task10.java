package by.epam.javaonline.step2.matrix;
//Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {
    public static void main(String[] args) {
        int dimension = 1 + (int)(Math.random() * 10);
        int[][]matrix = new int[dimension][dimension];
        System.out.println("Dimension: " + dimension);
        System.out.println("Matrix: ");
        for (int i = 0; i < dimension ; i++){
            for (int j = 0; j < dimension; j++){
                matrix[i][j] = 5 - (int)(Math.random() * 11);
                System.out.printf("%3d ",matrix[i][j]);
            }
            System.out.println();
        }
        System.out.print("Positive elements of main diagonal: ");
        for (int i = 0; i < dimension; i++){
            if(matrix[i][i] > 0){
                System.out.print(matrix[i][i] + " ");
            }

        }
    }
}
