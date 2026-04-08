import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int count = 1;
        for (int i = N ; i > (N-K); i--) {
            count *= i;
        }
        for (int i = K ; i >=1 ; i--) {
            count /= i;
        }

        System.out.println(count);
    }
}