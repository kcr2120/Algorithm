import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        // N의 자릿수 구하기
        int len = String.valueOf(N).length();
        // 생성자는 N보다 작거나 같고, 최소값은 N - 9*자릿수 (음수면 1로 시작)
        int start = N - 9 * len;
        if (start < 1) start = 1;

        // start부터 N까지 탐색
        for (int i = start; i <= N; i++) {
            int sum = i;
            int temp = i;

            // 각 자리수 합 계산
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            // sum이 N과 같으면 생성자
            if (sum == N) {
                result = i;
                break; // 가장 작은 생성자만 필요
            }
        }

        System.out.println(result);
    }
}