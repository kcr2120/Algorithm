import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 정수만 읽음; 엔터는 아직 남아있음
        sc.nextLine(); // 엔터 제거; 이 줄이 없으면 첫 nextLine()이 빈 문자열 읽음

        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();

            char first = s.charAt(0); // 첫 번째 문자 추출;
            char last = s.charAt(s.length() - 1);

            System.out.println("" + first + last); // 빈 문자열을 앞에 붙여서 문자->문자열로 반환
        }
    }
}