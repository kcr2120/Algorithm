class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long b = Long.parseLong(p);

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            String a = t.substring(i, i + p.length());
            long c = Long.parseLong(a);

            if (c <= b) {
                answer++;
            }
        }

        return answer;
    }
}