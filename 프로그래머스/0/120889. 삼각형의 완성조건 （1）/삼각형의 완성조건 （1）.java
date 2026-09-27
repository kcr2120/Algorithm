import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int answer = 0;
        int result = 0;
        answer = sides[0] + sides[1];
        if (sides[2] < answer) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }
}