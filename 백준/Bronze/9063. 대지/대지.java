import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];
        int[] y = new int[N];
        int mul = 1;

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            x[i] = Integer.parseInt(line[0]);
            y[i] = Integer.parseInt(line[1]);
        }
        if (N > 1) {
            Arrays.sort(x);
            Arrays.sort(y);
            mul = (x[N-1] - x[0]) * (y[N-1] - y[0]) ;

            System.out.println(mul);
        } else {
            System.out.println(0);
        }
    }
}