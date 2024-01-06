import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x value: ");
        double x = scanner.nextDouble();
        System.out.println("Please enter y value: ");
        double y = scanner.nextDouble();
        if (y < 2 && y > -2 && x < 3 && x > -3) {
            System.out.println("Orange");
        } else {
            System.out.println("White");
        }
    }
}
