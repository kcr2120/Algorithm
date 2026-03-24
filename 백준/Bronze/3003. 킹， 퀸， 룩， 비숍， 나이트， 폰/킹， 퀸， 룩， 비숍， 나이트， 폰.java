import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int[] line = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            line[i] = Integer.parseInt(arr[i]);
        }
        int[] answer = new int[arr.length];
        for (int i = 0; i < 2; i++) {
            answer[i] = 1 - line[i];
        }
        for (int i = 2; i < 5; i++) {
            answer[i] = 2 - line[i];
        }
        for (int i = 5; i < 6; i++) {
            answer[i] = 8 - line[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(answer[i] + " ");
        }

    }
}