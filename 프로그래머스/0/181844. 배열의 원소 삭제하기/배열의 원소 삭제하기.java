import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> arrMap = new TreeMap<>();
        Map<Integer, Integer> deleteMap = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            arrMap.put(i, arr[i]);
        }
        
        for(int i = 0; i < delete_list.length; i++) {
            deleteMap.put(delete_list[i], i);
        }
        
        for (Integer i : arrMap.keySet()) {
            if(!deleteMap.containsKey(arrMap.get(i))){
                answer.add(arrMap.get(i));
            }
        }
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}