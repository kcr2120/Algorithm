import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하면 Scanner보다 입력 속도가 훨씬 빠름
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 좌표 개수 입력

        // 좌표를 저장할 2차원 배열 생성
        int[][] arr = new int[N][2];

        // 좌표 입력 받기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // x 좌표
            arr[i][1] = Integer.parseInt(st.nextToken()); // y 좌표
        }

        // 좌표 정렬
        // 1차 기준: x 오름차순
        // 2차 기준: x가 같으면 y 오름차순
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1]; // x가 같으면 y 비교
                } else {
                    return a[0] - b[0]; // x 비교
                }
            }
        });

        // 정렬된 좌표 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.print(sb); // 한 번에 출력하면 속도 향상
    }
}