import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


class Solution {
    public int solution(String[] strArr) {
        
        HashMap<Integer, Integer> cntHash = new HashMap<>();
        
        for (int i = 0; i < strArr.length; i++) {
            cntHash.put(strArr[i].length(), cntHash.getOrDefault(strArr[i].length(), 0) + 1); 
        }
        
        Optional<Map.Entry<Integer, Integer>> maxEntryOptional 
             = cntHash.entrySet().stream().max(Map.Entry.comparingByValue());
        
     
        Map.Entry<Integer, Integer> maxEntry = maxEntryOptional.get();
        
        return maxEntry.getValue();
    }
}