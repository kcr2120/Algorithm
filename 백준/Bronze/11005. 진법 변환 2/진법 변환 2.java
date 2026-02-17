import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int N = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;

            if (remainder < 10) {
                sb.append(remainder);
            } else {
                sb.append((char)(remainder - 10 + 'A'));
            }

            N /= B;
        }

        System.out.println(sb.reverse().toString());
    }
}
