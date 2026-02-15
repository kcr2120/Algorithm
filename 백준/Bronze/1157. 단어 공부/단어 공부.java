import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase(); // 모두 대문자로 바꾸기

        int[] arr = new int[26];
        int max = 0;
        char result = '?';

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'A'; // A일 때 아스키코드 65.
            arr[index]++;

            if (arr[index] > max) {
                max = arr[index];
                result = word.charAt(i);
            } else if (arr[index] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
