import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        while(n != 1) {
            
            arrList.add(n);
            
            if (n % 2 == 0) {
                
                n /= 2; 
            } else {
                n = 3 * n + 1; 
            }
        }
        
        arrList.add(1);

        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}