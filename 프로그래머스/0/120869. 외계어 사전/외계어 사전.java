class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for (String str : dic) {
            
            boolean flag = true;
            
            for(String s : spell) {
                
                if(!str.contains(s)) {
                    flag = false;
                    break;
                }      
            }
            
            if (flag) 
                return 1;
        }
        
 
        
        return 2;
    }
}