package by.epam.javaonline.step2.matrix;
//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Task1 {
    public static void main(String[] args) {
        int rows = 1 + (int)(Math.random()*10);
        int columns = 1 + (int)(Math.random()*10);
        System.out.println("Dimensions: " + rows + " x " + columns + '\n');
        int[][]matrix = new int[rows][columns];// m is rows, n is columns
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = (int)(Math.random()*10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < columns; j+=2){
            if(matrix[0][j] > matrix[rows-1][j]){
                System.out.print("Column #" + (j+1) + ": ");
                for (int i = 0; i < rows  ; i++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        }
        /**/

    }
}

