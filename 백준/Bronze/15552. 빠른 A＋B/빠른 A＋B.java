import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String count = br.readLine();
        int a = Integer.parseInt(count);

        for (int i = 0; i < a; i++) {
            String line = br.readLine();
            String arr[] = line.split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);

            bw.write((A + B)+ "\n");
        }
        bw.flush();
    }
}