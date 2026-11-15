class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            
            if (a == ' ') {
                answer += a;
                continue;
            }
            if (a >= 'a' && a <= 'z') {
                answer += (char) ((a - 'a' + n) % 26 + 'a');
            } else {
                answer += (char) ((a - 'A' + n) % 26 + 'A');
            }
        }
        return answer;
    }
}