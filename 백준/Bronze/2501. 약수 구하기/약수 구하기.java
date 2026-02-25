import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        int count = 0;
        for (int i = 1; i <= N; i++) {

            if (N % i == 0) {
                count++;
                if (k == count) {
                    System.out.println(i);
                    break;
                }  else {
                    continue;
                }
            } else {
                continue;
            }

        }
        if (k > count) {
            System.out.println("0");
        }

    }
}