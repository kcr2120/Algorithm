import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int max = Math.max(a, Math.max(b, c));

            if (max >= a + b + c - max) {
                System.out.println("Invalid");
            }
            else if (a == b && b == c) {
                System.out.println("Equilateral");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }
        }
    }
}