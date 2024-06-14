class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(char c : number.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(c));
        }
        
        answer %= 9;
        return answer;
    }
}