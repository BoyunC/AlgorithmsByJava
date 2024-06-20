import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        
        myString = myString.replaceAll(" ", "");
        
        List<String> answer = new ArrayList<>(Arrays.asList(myString.split("x")));
        
        System.out.println(answer);
        
        answer.removeAll(Arrays.asList(""));

        Collections.sort(answer);
        
        return answer.toArray(new String[answer.size()]);
    }
}