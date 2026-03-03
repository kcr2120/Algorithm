import java.io.*;  // 입력을 빠르게 받기 위한 클래스 사용

public class Main {
    public static void main(String[] args) throws Exception {

        // 입력을 빠르게 받기 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄: 숫자의 개수 N
        int N = Integer.parseInt(br.readLine());

        // 둘째 줄: 숫자들 (공백으로 구분되어 있음)
        String[] line = br.readLine().split(" ");

        int sum = 0;  // 소수의 개수를 셀 변수

        // N개의 숫자를 하나씩 확인
        for (int i = 0; i < N; i++) {

            int num = Integer.parseInt(line[i]);  // 문자열을 정수로 변환

            // 1은 소수가 아니므로 건너뜀
            if (num < 2) {
                continue;
            }

            boolean isPrime = true;  // 일단 소수라고 가정

            // 2부터 자기 자신 전까지 나눠보기
            for (int j = 2; j < num; j++) {

                // 나누어 떨어지면 소수가 아님
                if (num % j == 0) {
                    isPrime = false;  // 소수 아님
                    break;            // 더 볼 필요 없으니 반복문 종료
                }
            }

            // 끝까지 나누어 떨어진 적이 없다면 소수
            if (isPrime) {
                sum++;  // 소수 개수 증가
            }
        }

        // 최종 소수 개수 출력
        System.out.println(sum);
    }
}