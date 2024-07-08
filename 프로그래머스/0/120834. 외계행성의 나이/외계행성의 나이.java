class Solution {
    public String solution(int age) {
        String answer = "";
        String[] aplah = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        while(age > 0) {
            int tmp = age % 10; 
            
            answer += aplah[tmp];
            age /= 10;
        }
        
        
        return new StringBuffer(answer).reverse().toString();
    }
}