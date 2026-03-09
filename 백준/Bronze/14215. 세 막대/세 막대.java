import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int[] stick = new int[3];
        for (int i = 0; i < 3; i++) {
            stick[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(stick);

        if (stick[2] >= stick[0] + stick[1]) {
            stick[2] = stick[0] + stick[1] - 1;
        }

        System.out.println(stick[0] + stick[1] + stick[2]);
    }
}