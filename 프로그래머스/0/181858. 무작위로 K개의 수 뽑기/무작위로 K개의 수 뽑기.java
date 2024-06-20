import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> tmp = new LinkedHashSet<>();
        int[] answer = new int[k];
        
        for (int i : arr) {
            tmp.add(i);
        }
        
        List<Integer> tmpList = new ArrayList<>(tmp);
    
        for (int i = 0; i < k; i++) {
            if(i > tmpList.size()-1) {
                answer[i] = -1;
            } else {
                answer[i] = tmpList.get(i);
            }
        }
        
        return answer;
    }
}