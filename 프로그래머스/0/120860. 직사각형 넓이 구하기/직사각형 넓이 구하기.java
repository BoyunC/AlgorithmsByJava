import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        
        for (int i=0; i < 4; i++) {
            maxX = Math.max(maxX, dots[i][0]);
            minX = Math.min(minX, dots[i][0]);
            
            maxY = Math.max(maxY, dots[i][1]);
            minY = Math.min(minY, dots[i][1]);
        }
        
        return Math.abs(maxX - minX) * Math.abs(maxY - minY);
    }
}