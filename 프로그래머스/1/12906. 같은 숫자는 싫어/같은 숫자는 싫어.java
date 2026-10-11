import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int number : arr) {
            if (stack.isEmpty() || stack.peek() != number) {
                stack.push(number);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        
        System.out.println();

        return answer;
    }
}