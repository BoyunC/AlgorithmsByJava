import java.io.*;
import java.util.*;

public class Main {
    static int[][] board = new int[5][5];
    static boolean[][] marked = new boolean[5][5];
    static Map<Integer, int[]> pos = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                board[i][j] = num;
                pos.put(num, new int[]{i, j}); 
            }
        }

        int count = 0;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                count++;
                int call = Integer.parseInt(st.nextToken());
                int[] p = pos.get(call);
                marked[p[0]][p[1]] = true; 

                if (checkBingo() >= 3) {
                    System.out.println(count);
                    return;
                }
            }
        }
    }

    static int checkBingo() {
        int bingo = 0;

        for (int i = 0; i < 5; i++) {
            boolean ok = true;
            for (int j = 0; j < 5; j++) {
                if (!marked[i][j]) { ok = false; break; }
            }
            if (ok) bingo++;
        }

        for (int j = 0; j < 5; j++) {
            boolean ok = true;
            for (int i = 0; i < 5; i++) {
                if (!marked[i][j]) { ok = false; break; }
            }
            if (ok) bingo++;
        }

        boolean ok = true;
        for (int i = 0; i < 5; i++) {
            if (!marked[i][i]) { ok = false; break; }
        }
        if (ok) bingo++;

        ok = true;
        for (int i = 0; i < 5; i++) {
            if (!marked[i][4 - i]) { ok = false; break; }
        }
        if (ok) bingo++;

        return bingo;
    }
}
