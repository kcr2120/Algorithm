import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] M = br.readLine().split(" ");

        double[] arr = new double[N];
        double max = 0;
        double sum = 0;

        // 최댓값 구하기
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(M[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 새로운 점수 합 구하기
        for (int i = 0; i < N; i++) {
            sum += (arr[i] / max) * 100;
        }

        System.out.println(sum / N);
    }
}