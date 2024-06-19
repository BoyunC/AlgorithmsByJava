import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
         ArrayList<String> answer = new ArrayList<>();
        
        for (String str : my_string.split(" ")) {
            
            if(!str.equals("")) {
                answer.add(str);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}