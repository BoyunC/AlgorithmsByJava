import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[^0-9]");
        
        for (String str : arr) {
            if(!str.equals(""))
                answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}