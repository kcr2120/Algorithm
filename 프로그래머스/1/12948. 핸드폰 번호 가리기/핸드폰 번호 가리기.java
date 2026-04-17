class Solution {
    public String solution(String phone_number) {
        String[] answer = phone_number.split("");
        
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer[i] = "*";
        }
        return String.join("",answer);
    }
}