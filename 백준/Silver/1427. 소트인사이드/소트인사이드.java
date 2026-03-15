import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");

        Arrays.sort(arr, Collections.reverseOrder());

        for (String s : arr) {
            System.out.print(s);
        }
    }
}