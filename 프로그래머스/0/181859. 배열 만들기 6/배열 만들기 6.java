import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            
            if(stk.size() == 0) {
                stk.add(arr[i++]);
            } else if (stk.size() > 0 && stk.get(stk.size()-1).equals(arr[i])) {
                stk.remove(stk.size() - 1);
                i++;
            } else if (stk.size() > 0 && !stk.get(stk.size()-1).equals(arr[i])) {
                stk.add(arr[i++]);
            }
        }
        
        if (stk.isEmpty()) {
            return new int[]{-1}; 
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}