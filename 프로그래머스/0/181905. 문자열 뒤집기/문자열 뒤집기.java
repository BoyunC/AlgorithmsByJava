class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        
        StringBuilder st = new StringBuilder(my_string.substring(s, e + 1));
        answer += st.reverse();
        
        if (e < my_string.length()) {
            answer += my_string.substring(e + 1);
        }
        
        return answer;
    }
}