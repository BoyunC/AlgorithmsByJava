import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] students = new int[rank.length + 1];
        
        for(int i = 0; i < rank.length; i++) {
            if (!attendance[i]) {
                rank[i] = 101; 
            }
        }
        
        for(int i = 0; i < rank.length; i++) {
            if (rank[i] != 101) {
                students[rank[i]] = i;
            }
        }
        
        Arrays.sort(rank);
        
        return 10000 * students[rank[0]] + 100 * students[rank[1]] + students[rank[2]];
    }
}