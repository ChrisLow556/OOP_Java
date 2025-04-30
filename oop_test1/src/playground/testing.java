package playground;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
        } catch (Throwable t) {
            System.out.println("Cannot divide by zero");
        }
    }
}
