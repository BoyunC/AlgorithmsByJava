class Solution {
    public String solution(String myString) {
        String answer = "";
        
        myString = myString.toLowerCase();
        
        for(char c : myString.toCharArray()) {
            if (c == 'a')
                answer += "A";
            else 
                answer += c;
        }
        
        return answer;
    }
}