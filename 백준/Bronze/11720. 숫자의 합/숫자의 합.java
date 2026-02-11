import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        String numbers = scanner.next();   // ⭐ 문자열로 받기 (한 줄로 받기)

        int sum = 0;

        for(int i = 0; i < count; i++) {
            sum += numbers.charAt(i) - '0';  // ⭐ 문자 → 숫자 변환
        }

        System.out.println(sum);
    }
}
