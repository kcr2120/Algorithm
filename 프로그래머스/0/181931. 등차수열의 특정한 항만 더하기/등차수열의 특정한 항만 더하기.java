class Solution {
    public int solution(int a, int d, boolean[] included) {
        int size = included.length;
        int[] answer = new int[size];
        int plus = a;
        answer[0] = a;
        int sum = 0;
        for (int i = 1; i < size; i++) {
            plus += d;
            answer[i] = plus;
        }
        
        for (int i = 0; i < size; i++) {
            if (included[i] == true) {
                sum += answer[i];
            } 
        }
        return sum;
    }
}