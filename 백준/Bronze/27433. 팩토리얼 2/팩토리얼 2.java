import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long count = 1;
        if (N == 0) {
            System.out.println(count);
        } else {
            for (int i = N; i >= 1; i--) {
                count *= i;

            }
            System.out.println(count);
        }

    }
}