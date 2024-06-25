import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

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