import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            int A = Integer.parseInt(arr[0]);
            String B = arr[1];

            for (int j = 0; j < B.length(); j++) {
                for (int k = 0; k < A; k++) {
                    bw.write(B.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}