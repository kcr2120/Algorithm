class Solution {
    public int solution(int balls, int share) {
        int r = Math.min(share, balls - share);
        return (int) comb(balls, r);
    }

    private long comb(int n, int r) {
        if (r == 0) {
            return 1;
        }

        return comb(n - 1, r - 1) * n / r;
    }
}