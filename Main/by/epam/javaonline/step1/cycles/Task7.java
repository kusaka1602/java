package by.epam.javaonline.step1.cycles;

public class Task7 {
    public static void main(String[] args) {
        int m = 1;
        int n = 1000;
        for(int i = m;i <= n;i++){
            System.out.print("Dividers of "+i+": ");
            for(int j = 2;j <= i/2;j++){
                if(i%j == 0){
                    System.out.print(j+" ");
                }
            }
            System.out.println("\n");
        }
    }
}
