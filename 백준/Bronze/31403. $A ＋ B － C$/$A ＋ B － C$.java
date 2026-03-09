import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        // 1) 숫자 계산
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        int C = Integer.parseInt(c);
        System.out.println(A + B - C);

        // 2) 문자열 이어붙이고 그 결과 정수로 변환 → C 빼기
        int combined = Integer.parseInt(a + b);
        System.out.println(combined - C);
    }
}