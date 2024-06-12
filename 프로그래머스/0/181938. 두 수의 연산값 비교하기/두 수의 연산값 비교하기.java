import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b; 
        
        int max = Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)),Integer.parseInt(String.valueOf(a) + String.valueOf(b)));
        
        
        answer = answer > max ? answer : max; 
        
        return answer;
    }
}