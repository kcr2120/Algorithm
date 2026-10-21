class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String name = String.valueOf(num);
        String[] str = new String[name.length()];
        str = name.split("");
        
        int[] arr = new int[name.length()];
        for (int i = 0; i < name.length(); i++)         {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                answer = i+1;
                break;
            } 
        }
        
        

        return answer;
    }
}