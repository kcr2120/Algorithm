import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) { // 배열을 -1로 초기화
            arr[i] = -1;
        }

        for (int i = 0; i < line.length(); i++) {
            int index = line.charAt(i) - 'a';

            if (arr[index] == -1) {
                arr[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
