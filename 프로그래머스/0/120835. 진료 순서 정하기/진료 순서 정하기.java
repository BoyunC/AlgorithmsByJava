import java.util.TreeMap; 
import java.util.Map.Entry;

class Solution {
    public int[] solution(int[] emergency) {
        
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int[] answer = new int[emergency.length];
        int cnt = emergency.length;
        
        for (int i=0; i < emergency.length; i++) {
            treeMap.put(emergency[i], i);
        }

        for (Entry<Integer, Integer> entry : treeMap.entrySet()) {
            answer[entry.getValue()] = cnt--;
        }
        
        return answer;
    }
}