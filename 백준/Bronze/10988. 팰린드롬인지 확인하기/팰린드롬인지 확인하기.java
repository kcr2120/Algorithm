import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String line2 = new StringBuilder(line).reverse().toString();

        if (line2.equals(line)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}