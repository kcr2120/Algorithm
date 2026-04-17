class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m), lcm(n, m)};
        return answer;
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b; // 나머지
            a = b;
            b = r;
        }
        return a;
    }

    // 2. 최소공배수(LCM) 구하기: 공식 적용
    public static int lcm(int a, int b) {
        // 오버플로우 방지를 위해 나눗셈을 먼저 하거나 (long) 형변환 고려
        return (a * b) / gcd(a, b); 
    }
}