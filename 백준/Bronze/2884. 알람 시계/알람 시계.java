import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (H > 0 && H <=23) {
            if (M >= 45 && M <= 59) {
                System.out.println(H + " " + (M-45));
            } else if (M >= 0 && M <= 44) {
                System.out.println((H-1) + " " + (M+15));
            } else  {
                System.out.println();
            }
        } else {
            if (M >= 45 && M <= 59) {
                System.out.println(H + " " + (M-45));
            } else if (M >= 0 && M <= 44) {
                System.out.println((24-1) + " " + (M+15));
            } else  {
                System.out.println();
            }
        }
    }
}