package by.epam.javaonline.step4.simpliestclasses;

public class Student {
    String fullName;
    int group;
    int[] marks = new int[5];
    boolean isExcellent;
    public Student(String fn, int g, int[] m){
        fullName = fn;
        group = g;
        marks = m;
        isExcellent = true;
        for (int i : marks){
            if (i < 9){
                isExcellent = false;
                break;
            }
        }
    }
}
