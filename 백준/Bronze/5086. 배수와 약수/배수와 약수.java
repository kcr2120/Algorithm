import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            // 🔥 종료 조건
            if (a == 0 && b == 0) {
                break;
            }

            if (b % a == 0) {
                System.out.println("factor");
            } else if (a % b == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}