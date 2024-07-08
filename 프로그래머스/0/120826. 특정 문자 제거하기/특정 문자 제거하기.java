class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for (char c : my_string.toCharArray()) {
            if(!letter.equals(c+"")) {
                answer += c; 
            }
        }
        
        
        return answer;
    }
}