import java.util.Arrays;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        Arrays.fill(answer, "");
        
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < k; j++) {
                for(int l = 0; l < picture[i].length(); l++) {
                    for (int m = 0; m < k; m++){
                       
                        answer[j + (k * i)] += picture[i].charAt(l);   
                    }
                }
            }
        }
        return answer;
    }
}