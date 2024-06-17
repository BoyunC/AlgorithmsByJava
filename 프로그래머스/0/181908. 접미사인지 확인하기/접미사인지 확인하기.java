class Solution {
    public int solution(String my_string, String is_suffix) {
        
        if (my_string.length() < is_suffix.length())
            return 0; 
        
        if (my_string.contains(is_suffix) && my_string.charAt(my_string.length()-1) == is_suffix.charAt(is_suffix.length()-1)) {
            
            return 1;
        }
        
        return 0;
    }
}