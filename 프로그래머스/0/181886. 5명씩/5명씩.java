class Solution {
    public String[] solution(String[] names) {
        // 결과 배열 크기 계산 (올림 처리)
        int size = (names.length + 4) / 5;
        String[] answer = new String[size];

        int idx = 0;
        for (int i = 0; i < names.length; i += 5) {
            answer[idx++] = names[i];
        }

        return answer;
    }
}