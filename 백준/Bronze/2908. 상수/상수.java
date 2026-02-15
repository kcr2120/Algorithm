import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int a = Integer.parseInt(new StringBuilder(arr[0]).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(arr[1]).reverse().toString());

        System.out.println(Math.max(a, b));
    }
}
