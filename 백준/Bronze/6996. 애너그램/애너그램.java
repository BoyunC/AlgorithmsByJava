import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static boolean solveAnagrams(String first, String second ) {
        if (first.length() != second.length()) return false;

        int[] count = new int[26]; // 알파벳 소문자만 들어옴

        // 첫 번째 단어의 알파벳 개수 증가
        for (char c : first.toCharArray()) {
            count[c - 'a']++;
        }

        // 두 번째 단어의 알파벳 개수 감소
        for (char c : second.toCharArray()) {
            count[c - 'a']--;
        }

        // 모든 카운트가 0이어야 애너그램
        for (int n : count) {
            if (n != 0) return false;
        }
        return true;

        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
