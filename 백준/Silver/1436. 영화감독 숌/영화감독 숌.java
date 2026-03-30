import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 찾고 싶은 "666이 포함된 수"의 순서 (N번째)

        int count = 0; // "666이 포함된 수"를 몇 개 찾았는지 세는 변수
        int num = 666; // 검사할 숫자 (최소값은 666부터 시작)

        while (true) { // 정답을 찾을 때까지 계속 반복
            // 현재 숫자를 문자열로 바꿔서 "666"이 포함되어 있는지 확인
            if (String.valueOf(num).contains("666")) {
                count++; // 포함되어 있으면 count 증가
            }

            // count가 N과 같아지면, 지금 num이 N번째 숫자
            if (count == N) {
                System.out.println(num); // 정답 출력
                break; // 반복 종료
            }

            num++; // 다음 숫자로 증가하면서 계속 탐색
        }
    }
}