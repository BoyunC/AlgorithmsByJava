class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int n : num_list) {
            
            while(n != 1) {
                answer++;
                
                if(n % 2 == 0) 
                    n /= 2; 
                else {
                    n -= 1;
                    n /= 2; 
                }
                    
            }
            
        }
        
        
        return answer;
    }
}