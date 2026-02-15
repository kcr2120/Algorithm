import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c = br.readLine().charAt(0); // 첫 번째 문자 꺼냄
        System.out.println((int)c);

    }
}
