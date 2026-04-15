class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long plus = 0;
        for (int i = 0; i < n; i++) {
            plus += x;
            answer[i] = plus;
        }
            
        return answer;
    }
}