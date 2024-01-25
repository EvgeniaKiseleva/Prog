import java.util.Scanner;

// Вывести первые 20 чисел фиббоначи, не используя массив

public class Homework_1 {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;

        System.out.print(number1 + " ");

        for (int i = 1; i <= 20; i++){
            System.out.print(number2 + " ");
            int doubleNumber1 = number1;
            int doubleNumber2 = number2;
            number1 = doubleNumber2;
            number2 = doubleNumber1 + doubleNumber2;
        }
    }
}