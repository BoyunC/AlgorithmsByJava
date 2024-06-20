import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        
        String[] strArr = myString.split("x");
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (String str : strArr) {
            answer.add(str.length());
        }
        
        if (myString.charAt(myString.length() - 1) == 'x') {
            answer.add(0);
        }
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}