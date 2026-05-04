class Solution {
    public int[] solution(int brown, int yellow) {

        // yellow의 약수를 찾기 위해 반복
        // i * i <= yellow → √yellow까지만 탐색 (최적화 핵심)
        for (int i = 1; i * i <= yellow; i++) {

            // i가 yellow의 약수인지 확인
            if (yellow % i == 0) {

                // (h - 2) = i → 내부 세로
                int h = i + 2;

                // (w - 2) = yellow / i → 내부 가로
                int w = (yellow / i) + 2;

                // brown 개수 확인 (테두리 타일 수)
                // 전체 둘레 = 2*w + 2*h - 4
                // (-4 하는 이유: 꼭짓점이 중복 계산되기 때문)
                if (2 * w + 2 * h - 4 == brown) {

                    // 조건 만족하면 바로 반환
                    return new int[]{w, h};
                }
            }
        }

        // 문제 조건상 항상 답이 있으므로 여기까지 올 일은 거의 없음
        return new int[0];
    }
}