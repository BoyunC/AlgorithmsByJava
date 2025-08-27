import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine()); // 정수 개수
            StringTokenizer st = new StringTokenizer(br.readLine());

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num < min) min = num;
                if (num > max) max = num;
            }

            output.append(min).append(" ").append(max).append("\n");
        }

        System.out.print(output);
    }
}