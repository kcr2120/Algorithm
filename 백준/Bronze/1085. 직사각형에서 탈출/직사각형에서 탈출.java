import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        int w = Integer.parseInt(arr[2]);
        int h = Integer.parseInt(arr[3]);

        int diff = Math.abs(x-w);
        int diff2 = Math.abs(y-h);
        int min = diff2;

        for (int i = 0; i < arr.length; i++) {
            if (diff < min) {
                min = diff;
            } else if (min > x) {
                min = x;
            } else if (min > y) {
                min = y;
            } else if (min > w) {
                min = w;
            } else if (min > h) {
                min = h;
            }
        }
        System.out.println(min);
    }
}