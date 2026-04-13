import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] DP = new int[N + 2];
        if (N == 0) {
            System.out.println(0);
        } else if (N == 1) {
            System.out.println(1);
        }else {

            DP[0] = 0;
            DP[1] = 1;

            for (int i = 2; i <= N; i++) {
                DP[i] = DP[i - 1] + DP[i - 2];
            }
            System.out.println(DP[N]);
        }
    }
}