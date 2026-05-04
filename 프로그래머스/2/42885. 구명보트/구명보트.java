import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        int count = 0;
        
        while (left <= right) {
            // 같이 탈 수 있으면
            if (people[left] + people[right] <= limit) {
                left++;
            }
            // 무거운 사람은 항상 태움
            right--;
            count++;
        }
        
        return count;
    }
}