class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = x1;
        int y2 = y1;

        for (int[] dot : dots) {
            if (dot[0] != x1) {
                x2 = dot[0];
            }
            if (dot[1] != y1) {
                y2 = dot[1];
            }
        }

        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }
}