import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder answer = new StringBuilder(a);
        
        for(int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            answer.setCharAt(i, ch >= 'A' && ch <= 'Z' ? (char) (ch + 'a' - 'A') : (char) (ch - 'a' + 'A'));
        }
    
        System.out.print(answer);
    }
}