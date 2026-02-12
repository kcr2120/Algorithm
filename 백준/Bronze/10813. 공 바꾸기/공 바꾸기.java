import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] arr = line.split(" ");
        int N = Integer.parseInt(arr[0]);
        int[] basket = new int[N] ;

        int M = Integer.parseInt(arr[1]);

        for (int a = 0; a < N; a++) {
            basket[a] = a + 1;
        }
        for (int b = 0; b < M; b++) {
            String ball = br.readLine();
            String[] arr2 = ball.split(" ");
            int i = Integer.parseInt(arr2[0]);
            int j = Integer.parseInt(arr2[1]);

            //swap
            int temp = basket[i-1];
            basket[i-1] = basket[j-1];
            basket[j-1] = temp;
        }
        // 출력
        for (int a = 0; a < N; a++) {
            System.out.print(basket[a] + " ");
        }
    }
}
