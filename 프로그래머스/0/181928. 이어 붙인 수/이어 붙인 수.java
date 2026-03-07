class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += String.valueOf(num_list[i]); 
             } else {
                odd += String.valueOf(num_list[i]);
            }
        }
        int evenNum = Integer.parseInt(even);
        int oddNum = Integer.parseInt(odd);

        return (evenNum + oddNum);

    }
}