import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        
        int[] array = new int[4];
        
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;
        
        Arrays.sort(array);
        
        if (array[0] != array[1] && array[1] != array[2] && array[2] != array[3]) {
            answer = array[0];
        }
        
        if (array[0] == array[3]) {
            answer = 1111 * array[0];
        }
        
        
        if ((array[0] == array[2]) && (array[0] != array[3])) {
            answer = (10 * array[0] + array[3]) * (10 * array[0] + array[3]);
        } else if ((array[1] == array[3]) && (array[1] != array[0])) {
            answer = (10 * array[1] + array[0]) * (10 * array[1] + array[0]);
        } else if ((array[0] == array[1]) && (array[1] != array[2]) && (array[2] == array[3])) {
            answer = (array[0] + array[2]) * (array[2] - array[0]);
        } else if ((array[0] == array[1]) && (array[1] != array[2]) && (array[2] != array[3])){
            answer = array[2] * array[3];
        } else if ((array[0] != array[1]) && (array[1] == array[2]) && (array[2]!= array[3])) {
            answer = array[0] * array[3];
        } else if ((array[0] != array[1]) && (array[1] != array[2]) && (array[2] == array[3])) {
            answer = array[0] * array[1];
        }
        
        return answer;
    }
}