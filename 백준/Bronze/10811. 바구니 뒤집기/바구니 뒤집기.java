import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] arr = line.split(" ");

        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int[] basket = new int[N];

        // 🔥 1~N으로 초기화 (여기 수정)
        for (int a = 0; a < N ; a++) {
            basket[a] = a + 1;
        }

        for (int b = 0; b < M; b++) {
            String ball = br.readLine();
            String[] arr2 = ball.split(" ");

            int i = Integer.parseInt(arr2[0]) - 1;
            int j = Integer.parseInt(arr2[1]) - 1;

            // 🔥 여기서 구간 뒤집기 (swap을 while 안에)
            while (i < j) {
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;

                i++;
                j--;
            }
        }

        // 출력
        for (int a = 0; a < N; a++) {
            System.out.print(basket[a] + " ");
        }
    }
}
