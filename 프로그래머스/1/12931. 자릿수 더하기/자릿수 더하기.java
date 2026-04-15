import java.util.*;

public class Solution {
    public int solution(int n) {
        String count = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < count.length(); i++) {
            char c = count.charAt(i);
            int digit = c - '0'; // 문자 → 숫자 변환
            sum += digit;
        }
        return sum;
    }
}