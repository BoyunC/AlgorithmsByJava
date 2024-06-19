class Solution {
    public String[] solution(String my_string) {
        
        if(!my_string.contains(" "))
            return new String[]{my_string};
        
        return my_string.split(" ");
    }
}