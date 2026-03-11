import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int count = 0;

        while (true) {
            if (N % 5 == 0) {
                count += N / 5;
                System.out.println(count);
                break;
            }
            N -= 3;
            count++;

            if (N < 0) {
                System.out.println(-1);
                break;
            }
        }
    }
}