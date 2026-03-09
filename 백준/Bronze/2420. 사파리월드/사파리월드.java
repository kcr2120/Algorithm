import java.io.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        long a = Integer.parseInt(num[0]);
        long b = Integer.parseInt(num[1]);
        long ab = a-b;
        System.out.println(Math.abs(ab));;
    }
}