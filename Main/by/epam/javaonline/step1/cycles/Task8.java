package by.epam.javaonline.step1.cycles;

public class Task8 {
    public static void main(String[] args) {
        int first = 123456789;
        int second = 887722331;

        int firstDigits = 1 + (int)Math.log10(first);//amount of digits
        int secondDigits = 1 + (int)Math.log10(second);//amount of digits
        int firstDigitContainer;//contains digits of "first"
        int secondDigitContainer;
        int firstTemp = first;//slice of "first"
        int secondTemp = second;

        for (int i = 1; i <= firstDigits ; i++) {
            firstDigitContainer = firstTemp % 10;
            firstTemp /= 10;
            for (int j = 1; j <= secondDigits ; j++) {
                secondDigitContainer = secondTemp % 10;
                secondTemp /= 10;
                if (firstDigitContainer == secondDigitContainer ) {
                    System.out.println(firstDigitContainer);
                }
            }
            secondTemp = second;
        }
    }
}
