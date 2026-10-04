class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int answer1 = 0;
        int answer2 = 0;
        int total = 0;
        
        if (arr1.length < arr2.length) {
            total = -1;
        } else if (arr1.length > arr2.length) {
            total = 1;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                answer1 += arr1[i];
            }
            for (int j = 0; j < arr2.length; j++) {
                answer2 += arr2[j];
            }
            if (answer1 < answer2) {
                total = -1;
            } else if (answer1 > answer2) {
                total = 1;
            } else {
                total = 0;
            }
        }
        
        
        return total;
    }
}