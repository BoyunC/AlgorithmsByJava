class Solution {
    public int solution(String myString, String pat) {
        
        if (myString.length() < pat.length())
            return 0;
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if(myString.contains(pat))
            return 1;
        
        return 0;
    }
}