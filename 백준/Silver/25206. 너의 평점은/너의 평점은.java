import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0.0;   // 학점 × 평점 합
        double totalCredit = 0.0;  // 학점 합

        for (int i = 0; i < 20; i++) {
            String[] arr = br.readLine().split(" ");

            double credit = Double.parseDouble(arr[1]);
            String grade = arr[2];

            if (grade.equals("P")) continue;

            double score = 0.0;

            switch (grade) {
                case "A+": score = 4.5; break;
                case "A0": score = 4.0; break;
                case "B+": score = 3.5; break;
                case "B0": score = 3.0; break;
                case "C+": score = 2.5; break;
                case "C0": score = 2.0; break;
                case "D+": score = 1.5; break;
                case "D0": score = 1.0; break;
                case "F": score = 0.0; break;
            }

            totalScore += credit * score;
            totalCredit += credit;
        }

        System.out.println(totalScore / totalCredit);
    }
}
