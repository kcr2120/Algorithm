import java.util.*;

class Solution {
    public int solution(int[] d, long budget) {
        Arrays.sort(d); // 🔥 핵심
        
        long sum = 0;
        int count = 0;
        
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            
            if (sum > budget) break; // 넘으면 끝
            
            count++;
        }
        
        return count;
    }
}