import java.util.ArrayList;


class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (String str : strArr) {
            if(str.contains("ad")) {
                continue;
            }
            
            answer.add(str);
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}