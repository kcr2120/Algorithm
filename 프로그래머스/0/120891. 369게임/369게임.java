class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for (char digit : String.valueOf(order).toCharArray()) {
            if (digit == '3' || digit == '6' || digit == '9') {
                answer++;
            }
        }
        
        
        return answer;
    } 
}