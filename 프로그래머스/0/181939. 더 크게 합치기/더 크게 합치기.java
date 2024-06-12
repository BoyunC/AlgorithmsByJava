class Solution {
    public int solution(int a, int b) {
        
        Integer answer = Integer.parseInt(String.valueOf(a) + String.valueOf(b)) > Integer.parseInt(String.valueOf(b) + String.valueOf(a)) ? Integer.parseInt(String.valueOf(a) + String.valueOf(b)) : Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        System.out.print(answer);
        return answer;
    }
}