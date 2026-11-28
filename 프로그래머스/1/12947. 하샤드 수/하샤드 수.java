class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int a = 0; 
        String str = String.valueOf(x);
        String[] arr = new String[str.length()];
        arr = str.split("");
        
        for (int i = 0; i < arr.length; i++) {
            a += Integer.parseInt(arr[i]);
        }
        if (x % a != 0) {
            answer = false;
        }
        
        return answer;
    }
}