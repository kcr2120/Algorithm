import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int[] num = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
            sum += num[i] * num[i];
        }
        System.out.println(sum % 10);


    }
}
