import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;

            int sum = 0;
            String result = "";

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    result += i + " + ";
                }
            }

            if (sum == n) {
                System.out.println(n + " = " + result.substring(0, result.length() - 3));
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}