class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        boolean isFirst = true; // 단어의 첫 글자인지
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                answer.append(c);
                isFirst = true; // 다음 문자는 첫 글자
            } else {
                if (isFirst) {
                    answer.append(Character.toUpperCase(c));
                    isFirst = false;
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }
        
        return answer.toString();
    }
}