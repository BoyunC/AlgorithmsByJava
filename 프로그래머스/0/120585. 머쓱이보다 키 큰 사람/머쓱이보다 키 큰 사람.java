import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int idx = -1; 
        
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            
            if(height >= array[i]){
                idx = i;
            }
        }

        return array.length - idx - 1;
    }
}