import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] list = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        
        if(arr.length == 1) {
            return arr;
        }
        
        for (int i = 1; i < list.length; i++) {
            if(arr.length > list[i-1] && arr.length <= list[i]) {
                answer = new int[list[i]];
                break;
            }
        }
        
        System.arraycopy(arr, 0, answer, 0, arr.length);
        
        return answer;
    }
}