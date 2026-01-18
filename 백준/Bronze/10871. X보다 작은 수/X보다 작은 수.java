import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        int X = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            arr[i] = A;
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] < X ) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}