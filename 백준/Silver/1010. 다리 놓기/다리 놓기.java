import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 최대 30까지라 미리 DP 테이블 생성
        int[][] dp = new int[31][31];

        // 초기값 설정
        for (int i = 0; i <= 30; i++) {
            dp[i][0] = 1;  // 0개 선택
            dp[i][i] = 1;  // 전부 선택
        }

        // 점화식 적용
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        // 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]); // 서쪽
            int M = Integer.parseInt(input[1]); // 동쪽

            System.out.println(dp[M][N]);
        }
    }
}