import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int val = 2;
        
        while (n != 1) {
            
            if (n % val == 0) {
                
                answer.add(val);
                
                while (n % val == 0) {
                    n /= val;
                }
            }
            
            val += 1;
        }
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}