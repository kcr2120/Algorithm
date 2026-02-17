import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] arr = line.split(" ");
        String a = arr[0];
        int b = Integer.parseInt(arr[1]);
        int value;
        int sum = 0;
        for (int i = 0; i <a.length(); i++) {
            int count = 1;
            char c = a.charAt(i);
            if ('0' <= c && c <= '9') {
                value = c - '0';
            } else {
                value = c - 'A' + 10;
            }
            for (int j = 0; j < a.length()-1-i; j++) {
                count *= b;
            }
            sum += value * count;
        }
        System.out.println(sum);
    }
}
