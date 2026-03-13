import java.util.Arrays;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        String[] arr2 = br.readLine().split(" ");
        int[] arr3 = new int[N];
        for (int i = 0; i < N; i++) {
            arr3[i] = Integer.parseInt(arr2[i]);
        }
        Arrays.sort(arr3);
        System.out.println(arr3[N - k]);
    }
}