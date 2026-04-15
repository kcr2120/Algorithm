class Solution {
    public int solution(int a, int b) {
        int k = 0;
        if (a % 2 == 1 && b % 2 == 1) k = a*a + b*b;
        else if (a % 2 == 0 && b % 2 == 0) k = Math.abs(a-b);
        else k = 2 * (a + b);
        
        return k;
    }
}