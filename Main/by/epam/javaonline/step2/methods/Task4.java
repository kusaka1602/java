package by.epam.javaonline.step2.methods;

public class Task4 {
    public static void main(String[] args) {
        double[] points = {2, 3, 3, 1, 6, 7,10,15,189,546,0,0};//dots
        for(double i:longestPath(points)){
            System.out.println(i+ " ");
        }
    }
    public static double metric(double x1, double y1, double x2, double y2){
        return Math.sqrt((Math.pow(x2 - x1,2)) + Math.pow(y2- y1,2));
    }
    public static double[] longestPath(double[]points){
        double[] point = {0,0,0};//[source, destination, distance]
        double distance;
        for(int i = 0; i < points.length/2; i++){
            for (int j = 0; j < points.length/2; j++){
                distance = metric(points[i*2],points[i*2 + 1],points[j*2],points[j*2 + 1]);
                if(distance > point[2]){
                    point[2] = distance;
                    point[1] = j + 1;
                    point[0] = i + 1;
                }
            }
        }
        return point;
    }
}
