import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // 입력을 빠르게 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정수 N 입력 (몇 개의 수를 정렬할지)
        int N = Integer.parseInt(br.readLine());

        // 숫자 범위가 1~10000이므로 count 배열 생성
        // count[i] = i라는 숫자가 몇 번 나왔는지 저장
        int[] count = new int[10001];

        // N개의 숫자 입력 받기
        for (int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            count[num]++; // 해당 숫자 등장 횟수 증가
        }

        // 출력 속도를 빠르게 하기 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        // 1부터 10000까지 모든 숫자를 확인
        for (int i = 1; i <= 10000; i++) {
            // count[i]만큼 i를 출력
            while (count[i] > 0) {
                sb.append(i).append("\n"); // 개행과 함께 추가
                count[i]--; // 출력했으므로 1 감소
            }
        }

        // 한 번에 출력
        System.out.print(sb);
    }
}