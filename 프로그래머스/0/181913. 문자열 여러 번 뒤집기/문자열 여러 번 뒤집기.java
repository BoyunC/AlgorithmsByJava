class Solution {
    public String solution(String my_string, int[][] queries) {
        
        for(int i = 0; i < queries.length; i++) {
            String answer = "";
            
            if(queries[i][0] != 0) { 
                answer += my_string.substring(0, queries[i][0]);
            }
            
            StringBuffer bf = new StringBuffer(my_string.substring(queries[i][0], queries[i][1]+1)); 
            answer += bf.reverse().toString();
            
            if (my_string.length() > queries[i][1] + 1) {
                answer += my_string.substring(queries[i][1] + 1);
            }

            my_string = answer;
            
        }
        
    
        return my_string;
    }
}