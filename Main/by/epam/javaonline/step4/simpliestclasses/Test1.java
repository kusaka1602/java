package by.epam.javaonline.step4.simpliestclasses;

public class Test1 {
    double x;
    double y;
    public void printX(){
        System.out.println(x);
    }
    public void printY(){
        System.out.println(y);
    }
    public void setX(double num){
        x = num;
    }
    public void setY(double num){
        y = num;
    }
    public double getSumXY(){
        return x + y;
    }
    public double getMaxXY(){
        return Math.max(x, y);
    }
}
