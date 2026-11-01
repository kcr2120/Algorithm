class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = (n / gcd) * m;
        
        return new int[]{gcd, lcm};
    }
    
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
    }
}