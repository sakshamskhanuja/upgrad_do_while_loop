import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scanner = new Scanner(System.in);

        // Stores the entered number.
        int n = scanner.nextInt();

        do {
            System.out.println(n);
            n--;
        } while (n >= 0);
    }
}