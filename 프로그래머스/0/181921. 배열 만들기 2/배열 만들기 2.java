import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
      
        for(int i = l; i <= r; i ++) {
            
            boolean flag = true;
            
            String str = String.valueOf(i);
            
            for(char c : str.toCharArray()) {
                if (c != '0' && c != '5') {
                    flag = false;
                    break; 
                }
            }
            
            if(flag) {
                arrList.add(i);
            }
        }
        
        if (arrList.size() == 0) {
            return new int[] {-1};
        }
        
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}