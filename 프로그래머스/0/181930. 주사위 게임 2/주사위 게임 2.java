import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        Solution sol = new Solution();
        System.out.println(sol.solution(a,b,c));
    }    
    
    int answer = 0;
    
    public int solution(int a, int b, int c) {
        if (a == b && b == c) {
            return (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        } else if (a == b || a == c || b == c) {
            return (a + b + c) * (a*a + b*b + c*c);
        } else {
            return a + b + c;
        }
    }
}