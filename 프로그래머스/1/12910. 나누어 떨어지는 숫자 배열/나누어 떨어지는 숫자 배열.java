import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        // 1. 나누어 떨어지는 값만 저장
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        
        // 2. 아무것도 없으면 -1 반환
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        // 3. 정렬
        Collections.sort(list);
        
        // 4. 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}