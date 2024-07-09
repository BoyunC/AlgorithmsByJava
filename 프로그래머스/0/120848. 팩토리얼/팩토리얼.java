class Solution {
    public int solution(int n) {
        int answer = 1; 
        int val = 1; 
        
        while (n >= val) {
            
            val *= ++answer; 
        }
        
        return answer - 1;
    }
}