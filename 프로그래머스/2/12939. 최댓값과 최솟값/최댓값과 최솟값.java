import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] input = s.split(" ");
        int[] arr = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        
        return arr[0] + " " + arr[input.length - 1];
    }
}