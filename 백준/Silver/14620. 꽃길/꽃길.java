import java.util.*;
public class Main {
    static int N;
    static int[][] grid;
    static int[] dx = {0, 1, -1, 0, 0};
    static int[] dy = {0, 0, 0, 1, -1};
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // 후보 좌표는 (1,1) ~ (N-2, N-2)
        int size = (N - 2) * (N - 2);

        // 3개 좌표 조합
        for (int a = 0; a < size; a++) {
            for (int b = a + 1; b < size; b++) {
                for (int c = b + 1; c < size; c++) {
                    // 좌표 변환
                    int ax = a / (N - 2) + 1, ay = a % (N - 2) + 1;
                    int bx = b / (N - 2) + 1, by = b % (N - 2) + 1;
                    int cx = c / (N - 2) + 1, cy = c % (N - 2) + 1;

                    int cost = calc(ax, ay, bx, by, cx, cy);
                    if (cost != -1) {
                        answer = Math.min(answer, cost);
                    }
                }
            }
        }
        System.out.println(answer);
    }

    // 세 개의 꽃이 겹치지 않으면 비용 반환, 겹치면 -1
    static int calc(int ax, int ay, int bx, int by, int cx, int cy) {
        boolean[][] visited = new boolean[N][N];
        int total = 0;

        // 꽃 3개 심기
        int[][] flowers = {{ax, ay}, {bx, by}, {cx, cy}};
        for (int[] f : flowers) {
            int x = f[0], y = f[1];
            for (int k = 0; k < 5; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (visited[nx][ny]) return -1; // 겹침
                visited[nx][ny] = true;
                total += grid[nx][ny];
            }
        }
        return total;
    }
}