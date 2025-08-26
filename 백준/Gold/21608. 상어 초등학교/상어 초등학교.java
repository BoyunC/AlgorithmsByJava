import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] seat = new int[N][N];
        Map<Integer, List<Integer>> likeMap = new HashMap<>();

        int[] order = new int[N * N];
        for (int i = 0; i < N * N; i++) {
            int student = sc.nextInt();
            order[i] = student;

            List<Integer> likes = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                likes.add(sc.nextInt());
            }
            likeMap.put(student, likes);
        }

        // 방향 벡터 (상, 하, 좌, 우)
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // 자리 배치
        for (int idx = 0; idx < order.length; idx++) {
            int student = order[idx];

            int bestR = -1, bestC = -1;
            int bestLike = -1, bestEmpty = -1;

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (seat[r][c] != 0) continue; // 이미 학생 앉음

                    int likeCnt = 0;
                    int emptyCnt = 0;

                    for (int d = 0; d < 4; d++) {
                        int nr = r + dr[d];
                        int nc = c + dc[d];
                        if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;

                        if (seat[nr][nc] == 0) emptyCnt++;
                        else if (likeMap.get(student).contains(seat[nr][nc])) likeCnt++;
                    }

                    // 우선순위 비교
                    if (likeCnt > bestLike
                            || (likeCnt == bestLike && emptyCnt > bestEmpty)
                            || (likeCnt == bestLike && emptyCnt == bestEmpty
                            && (bestR == -1 || r < bestR || (r == bestR && c < bestC)))) {
                        bestR = r;
                        bestC = c;
                        bestLike = likeCnt;
                        bestEmpty = emptyCnt;
                    }
                }
            }

            seat[bestR][bestC] = student;
        }

        // 만족도 계산
        int total = 0;
        int[] score = {0, 1, 10, 100, 1000};

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                int student = seat[r][c];
                int likeCnt = 0;

                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d];
                    int nc = c + dc[d];
                    if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;

                    if (likeMap.get(student).contains(seat[nr][nc])) likeCnt++;
                }

                total += score[likeCnt];
            }
        }

        System.out.println(total);
    }
}
