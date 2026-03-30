import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        int d = Integer.parseInt(line[3]);
        int e = Integer.parseInt(line[4]);
        int f = Integer.parseInt(line[5]);

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if (a*x + b*y == c && d*x + e*y == f) {
                    System.out.println(x + " " + y);
                    return; //  찾으면 끝
                }
            }
        }
    }
}