import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            int v = Integer.parseInt(br.readLine());

            int count = 0;

            for (int i = 0; i < N; i++) {
                int a = Integer.parseInt(arr[i]);
                if (a == v) {
                    count++;
                }
            }

            bw.write(count + "\n");
            bw.flush();
    }
}