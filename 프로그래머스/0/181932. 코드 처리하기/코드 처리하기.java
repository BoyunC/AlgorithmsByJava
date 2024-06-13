class Solution {
    public String solution(String code) {
        String answer = "";
        Boolean mode = false;
        
        for(int i = 0; i < code.length(); i++) {
            if (!mode) {
                if(code.charAt(i) == '1') {
                    mode = !mode;
                } else if (code.charAt(i) != '1' && i % 2 == 0) {
                    answer += code.charAt(i);
                }
            } else {
                if(code.charAt(i) == '1') {
                    mode = !mode;
                } else if (code.charAt(i) != '1' && i % 2 == 1) {
                    answer += code.charAt(i);
                }
            }
        }
        
        if (answer.equals("")) {
            return "EMPTY";
        }
    
        return answer;
    }
}