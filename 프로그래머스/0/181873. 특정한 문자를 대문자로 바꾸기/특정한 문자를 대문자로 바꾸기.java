class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for (char c : my_string.toCharArray()) {
            if (alp.equals(String.valueOf(c))) {
                answer += alp.toUpperCase();
            } else {
                answer += c; 
            }
            
        }
        
        return answer;
    }
}