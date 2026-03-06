import java.io.*;  // 입력을 빠르게 받기 위한 클래스 사용

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            if (N == 1) {break;}

            while (N % i == 0) {
                isPrime = false;
                System.out.println(i);
                N /= i;
                continue;
            }
        }
    }
}