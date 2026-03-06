import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            String[] line2 = br.readLine().split(" ");
            int c = Integer.parseInt(line2[0]);
            int d = Integer.parseInt(line2[1]);
            String[] line3 = br.readLine().split(" ");
            int e = Integer.parseInt(line3[0]);
            int f = Integer.parseInt(line3[1]);

            int g = 0;
            int h = 0;
            if (a == c) {
                g = e;
            } else if (a == e) {
                g = c;
            } else if (c == e) {
                g = a;
            }

            if (b == d) {
                h = f;
            } else if (b == f) {
                h = d;
            } else if (d == f) {
                h = b;
            }
        System.out.println(g + " " + h);
    }
}