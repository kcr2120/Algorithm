import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = sc.nextBoolean();
        
        Solution sol = new Solution();
        System.out.println(sol.solution(a,b,flag));
    }
    
    public int solution(int a, int b, boolean flag) {
        if (flag == true) {
            return a + b;
        } else {
            return a - b;
        }
    }
}