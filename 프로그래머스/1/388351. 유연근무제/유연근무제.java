class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;
        int[] arr = new int[schedules.length];
        
        for (int i = 0; i < schedules.length; i++) {
            arr[i] = schedules[i] + 10;
            if (arr[i] % 100 >= 60) {
                arr[i] = arr[i] + 100 - 60;
            }
        }

        for (int i = 0; i < schedules.length; i++) {
            for (int j = 0; j < timelogs[0].length; j++) {
                int day = (startday + j - 1) % 7 + 1;

                if (day == 6 || day == 7) {
                    continue;
                }
                if (timelogs[i][j] > arr[i]) {
                    answer--;
                    break;
                }
            }
        }

        return answer;
    }
}