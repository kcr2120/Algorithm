import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();   // n 입력만 받고 값을 쓰진 않음

        // 코드1은 항상 한 번만 실행된다
        System.out.println(1);
        // 시간복잡도 상수이므로 최고차항의 차수는 0
        System.out.println(0);
    }
}