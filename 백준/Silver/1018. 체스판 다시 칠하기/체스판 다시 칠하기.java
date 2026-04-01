import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        int result = Integer.MAX_VALUE; // 최솟값 저장

        // 8x8 시작점 탐색 (<= 주의)
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {

                int countW = 0; // W 시작 경우
                int countB = 0; // B 시작 경우

                // 8x8 검사
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {

                        // (x+y)%2로 위치 색 결정
                        if ((x + y) % 2 == 0) {
                            if (arr[x][y] != 'W') countW++;
                            if (arr[x][y] != 'B') countB++;
                        } else {
                            if (arr[x][y] != 'B') countW++;
                            if (arr[x][y] != 'W') countB++;
                        }

                    }
                }

                // 두 경우 중 최소 선택
                result = Math.min(result, Math.min(countW, countB));
            }
        }

        System.out.println(result);
    }
}