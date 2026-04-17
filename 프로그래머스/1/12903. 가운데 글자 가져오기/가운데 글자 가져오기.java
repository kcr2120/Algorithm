class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        String[] arr = new String[2];
        
        if (answer.length % 2 == 0) {
            arr[0] = answer[(answer.length)/2 -1];
            arr[1] = answer[(answer.length)/2];
        } else {
            arr[0] = answer[(answer.length - 1) / 2];
            arr[1] = "";
        }
        return String.join("" , arr);
    }
}