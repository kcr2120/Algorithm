import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (90 <= score && 100 >= score) {
            System.out.println("A");
        } else if (80 <= score && 89 >= score) {
            System.out.println("B");
        } else if (70 <= score && 79 >= score) {
            System.out.println("C");
        } else if (60 <= score && 69 >= score) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}