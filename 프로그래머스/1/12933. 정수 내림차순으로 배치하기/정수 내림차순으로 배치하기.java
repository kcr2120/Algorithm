import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        String result = String.join("",arr);
        return Long.parseLong(result);
    }
}