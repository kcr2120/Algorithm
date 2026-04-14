import java.io.*;

public class Main {
    static int count1 = 0;
    static int count2 = 0;
    static int[] f = new int[41];

    static int fib(int n) {
        if (n==1 | n==2) {
            count1++;
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    static int fibonacci(int n) {
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            count2++;
            f[i] = f[n-1] + f[n-2];
        }
        return f[n];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fib(n);
        fibonacci(n);

        System.out.println(count1 + " " + count2);
    }
}
