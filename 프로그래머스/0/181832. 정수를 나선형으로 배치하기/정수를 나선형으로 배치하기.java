class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n]; 
        
        int x = 0, y = 0, dir = 0;
        int dx[] = {1, 0, -1, 0};
        int dy[] = {0, 1, 0, -1};
        
        int val = 1;
        
        while ( val <= n * n) {
            
            answer[y][x] = val++; 
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if (nx < 0 || ny < 0 || nx >= n || ny >= n || answer[ny][nx] != 0) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            
            x = nx;
            y = ny;
            
            System.out.println(x + " " + y);
        }
        
        return answer;
    }
}