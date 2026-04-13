import java.io.*;

public class Main {
    static int count = 0;

    public static int recursion(String input, int l, int r) {
        count++;

        if (l >= r) return 1; //중앙 도달 → 팰린드롬
        else if (input.charAt(l) != input.charAt(r)) return 0; //다르면 → 팰린드롬 아님
        else return recursion(input, l+1, r-1); //재귀호출
    }

    // 팰린드롬 확인 함수
    public static int isPalindrome(String s) {
        count = 0; // 테스트케이스마다 초기화
        return recursion(s, 0, s.length() - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            int result = isPalindrome(input);
            System.out.println(result + " " + count);
        }
    }
}