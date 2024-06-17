class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        if (m == 1 & c == 1) {
            return my_string;
        }
        
        for(int i = 0; i < my_string.length() / m; i++) {
            answer += my_string.charAt(c + m * i - 1);
        }
    
        return answer;
    }
}