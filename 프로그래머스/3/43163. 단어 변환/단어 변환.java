import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    public int solution(
            String begin,
            String target,
            String[] words
    ) {
        Queue<String> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];

        queue.offer(begin);

        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String current = queue.poll();

                if (current.equals(target)) {
                    return count;
                }
                for (int j = 0; j < words.length; j++) {
                    if (!visited[j]&& canChange(current, words[j])) {
                        visited[j] = true;
                        queue.offer(words[j]);
                    }
                }
            }

            count++;
        }

        return 0;
    }

    private boolean canChange(
            String first,
            String second
    ) {
        int different = 0;

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                different++;
            }
        }

        return different == 1;
    }
}