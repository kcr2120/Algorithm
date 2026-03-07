class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n + 1]; // +1은 마지막에 새로운 값 추가할 때
        
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        
        int last = num_list[n - 1];
        int secondLast = num_list[n - 2];
        if (last > secondLast) {
            answer[n] = last - secondLast;
        } else {
            answer[n] = last * 2;
        }
        return answer;
    }
}