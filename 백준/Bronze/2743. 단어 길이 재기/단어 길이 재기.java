import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alpha = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < alpha.length(); i++) {
            sum++;
        }
        System.out.println(sum);
    }
}