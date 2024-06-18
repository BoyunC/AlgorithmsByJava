import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr[0] == 2 & arr[arr.length - 1] == 0)
            return arr; 
        
        ArrayList<Integer> answer = new ArrayList<>();
        int[] idxs = {-1, -1};
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (idxs[0] == -1) {
                    idxs[0] = i;
                } else {
                    idxs[1] = i;
                }
            } 
        }
        
        if (idxs[0] == -1) {
            return new int[]{-1};
        } else if (idxs[1] == -1) {
            idxs[1] = idxs[0];
        }
        
        return Arrays.copyOfRange(arr, idxs[0], idxs[1] + 1 );
    }
}