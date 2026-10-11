import java.util.Stack;

class Solution {
    public int sumOfSquares(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                stack.push(nums[i - 1]);
            }
        }

        int answer = 0;

        while (!stack.isEmpty()) {
            int number = stack.pop();
            answer += number * number;
        }

        return answer;
    }
}