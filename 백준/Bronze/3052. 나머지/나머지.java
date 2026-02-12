import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] check = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int N = Integer.parseInt(br.readLine());
            check[N % 42] = 1;
        }

        for (int i = 0; i < 42; i++) {
            if (check[i] == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
