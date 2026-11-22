class Solution {
    public int[] solution(int[] answers) {
        int A = 0;
        int B = 0;
        int C = 0;
        
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) A++;
            if (answers[i] == b[i % 8]) B++;
            if (answers[i] == c[i % 10]) C++;
        }
        int max = Math.max(A, Math.max(B,C));
        
        int count = 0;
        if (A == max) count++;
        if (B == max) count++;
        if (C == max) count++;

        int[] answer = new int[count];
        int index = 0;
        
        if (A == max) answer[index++] = 1;
        if (B == max) answer[index++] = 2;
        if (C == max) answer[index++] = 3;

        return answer;
    }
}