import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int sum = 0;

        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if(c >= 'A' && c <= 'C') sum += 3;
            else if(c <= 'F') sum += 4;
            else if(c <= 'I') sum += 5;
            else if(c <= 'L') sum += 6;
            else if(c <= 'O') sum += 7;
            else if(c <= 'S') sum += 8;
            else if(c <= 'V') sum += 9;
            else sum += 10;
        }

        System.out.println(sum);
    }
}
