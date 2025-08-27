import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        List<String> suffixes = new ArrayList<>();

        // 1. 모든 접미사 구하기
        for (int i = 0; i < s.length(); i++) {
            suffixes.add(s.substring(i));
        }

        // 2. 사전순 정렬
        Collections.sort(suffixes);

        // 3. 출력
        for (String suffix : suffixes) {
            System.out.println(suffix);
        }
    }
}
