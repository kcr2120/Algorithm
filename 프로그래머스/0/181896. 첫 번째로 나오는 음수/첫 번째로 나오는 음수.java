class Solution {
    public int solution(int[] num_list) {
        int n = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                n = i;
                break;
            } else {
                n = -1;
            }
        }
        return n;
    }
}