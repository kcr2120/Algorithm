class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] array = my_string.split(" ");
        
        answer = Integer.parseInt(array[0]);
        
        for (int i = 1; i < array.length; i+=2) {
               
            if (array[i].equals("+")) {
                int a = Integer.parseInt(array[i + 1]);
                answer += a;
            } else {
                int a = Integer.parseInt(array[i + 1]);
                answer -= a;
            }

        }
        return answer;
    }
}