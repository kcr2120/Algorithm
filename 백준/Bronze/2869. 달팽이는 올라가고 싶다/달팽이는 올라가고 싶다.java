import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] parts = line.split(" ");

        int answer = 0;

        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int V = Integer.parseInt(parts[2]);

        int days = (V - A) / (A - B);

        if ((V - A) % (A - B) != 0) {
            days++;
        }

        days++;

        System.out.println(days);
    }
}
