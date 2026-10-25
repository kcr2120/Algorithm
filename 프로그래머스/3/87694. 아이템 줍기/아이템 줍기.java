import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    static final int SIZE = 102;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int solution(
            int[][] rectangle,
            int characterX,
            int characterY,
            int itemX,
            int itemY
    ) {
        int[][] map = new int[SIZE][SIZE];

        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2;
            int y1 = rect[1] * 2;
            int x2 = rect[2] * 2;
            int y2 = rect[3] * 2;

            for (int x = x1; x <= x2; x++) {
                for (int y = y1; y <= y2; y++) {

                    // 직사각형 내부
                    boolean inside =
                            x1 < x && x < x2
                            && y1 < y && y < y2;

                    if (inside) {
                        map[x][y] = 2;
                    } else if (map[x][y] != 2) {
                        // 직사각형 테두리
                        map[x][y] = 1;
                    }
                }
            }
        }

        int startX = characterX * 2;
        int startY = characterY * 2;

        int targetX = itemX * 2;
        int targetY = itemY * 2;

        boolean[][] visited = new boolean[SIZE][SIZE];
        int[][] distance = new int[SIZE][SIZE];

        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int x = current[0];
            int y = current[1];

            if (x == targetX && y == targetY) {
                // 좌표를 2배로 키웠으므로 거리도 2로 나누기
                return distance[x][y] / 2;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= SIZE
                        || ny < 0 || ny >= SIZE) {
                    continue;
                }

                if (map[nx][ny] == 1
                        && !visited[nx][ny]) {

                    visited[nx][ny] = true;
                    distance[nx][ny] =
                            distance[x][y] + 1;

                    queue.offer(new int[]{nx, ny});
                }
            }
        }

        return 0;
    }
}