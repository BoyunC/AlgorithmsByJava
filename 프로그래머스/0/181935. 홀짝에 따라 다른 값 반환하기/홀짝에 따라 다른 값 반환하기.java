class Solution {
    public int solution(int n) {
        int even = 0;
        int odd = 0;
        
        for (int i=0; i<=n; i++) {
            if(i % 2 != 0) {
                odd += i;
            } else {
                even += i * i;
            }
        }
    
        int answer = n % 2 == 0 ? even : odd;
        
        
        return answer;
    }
}