import java.util.Scanner;


// Вывести первые 20 чисел фиббоначи, не используя массив


public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x value: ");
        double x = scanner.nextDouble();
        System.out.println("Please enter y value: ");
        double y = scanner.nextDouble();
        if (y == 0 || x == 0) {
            System.out.println("black");
        } else if (y < 2 && y > -2 && x < 3 && x > -3) {
            System.out.println("Orange");
        } else if (y > 3.0 / 5.0 * x - 2) {
            System.out.println("Yellow");
        } else if (y < x - 7) {
            System.out.println("Green");
        } else if (y == 2 || y == -2 || x == 3 || x == -3 || y == 3.0 / 5.0 * x - 2 || y == x - 7) {
            System.out.println("Blue");
        } else {
            System.out.println("White");
        }
    }
}
