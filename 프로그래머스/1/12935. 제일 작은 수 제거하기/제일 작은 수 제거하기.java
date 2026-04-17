class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 1. 최소값 찾기
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        // 2. 최소값 제외하고 새 배열 만들기
        int[] result = new int[arr.length - 1];
        int idx = 0;

        for (int num : arr) {
            if (num != min) {
                result[idx++] = num;
            }
        }

        return result;
    }
}