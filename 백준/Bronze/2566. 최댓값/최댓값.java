import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] A = new int[9][9];

        int max = Integer.MIN_VALUE;  // 가장 안전한 초기값
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < 9; i++) {
            String[] line = br.readLine().split(" ");

            for (int j = 0; j < 9; j++) {
                A[i][j] = Integer.parseInt(line[j]);

                if (A[i][j] > max) {
                    max = A[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((maxRow + 1) + " " + (maxCol + 1));
    }
}
