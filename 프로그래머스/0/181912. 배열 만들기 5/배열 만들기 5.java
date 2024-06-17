import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            
            
            
            int tmp = Integer.parseInt(intStrs[i].substring(s, s+l));
            System.out.println(tmp);
            
            if(tmp > k) 
                answer.add(tmp);
            
        }
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}