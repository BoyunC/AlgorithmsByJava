class Solution {
    public int solution(int[] num_list) {
        int add = 0;
        int mul = 1; 
        
        for (int i : num_list) {
            add += i;
            mul *= i;
        }
        
       add *= add; 
        
        if (mul < add)
            return 1;
        
        return 0;

    }
}