class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(char s : my_string.toCharArray()) {
            for(int i = 0; i < n; i++) {
                answer += s;
            }
        }
        
        return answer;
    }
}