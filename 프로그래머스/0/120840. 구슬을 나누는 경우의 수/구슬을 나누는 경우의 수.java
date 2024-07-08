import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger answer = BigInteger.valueOf(1);
        
        for(int i = 1; i <= balls; i++) {
            answer = answer.multiply(BigInteger.valueOf(i));
        }
        
        for(int i = 1; i <= balls - share; i++) {
            answer = answer.divide(BigInteger.valueOf(i));
        }
        
        for(int i = 1; i <= share; i++) {
            answer = answer.divide(BigInteger.valueOf(i));
        }
        
        return answer.intValue();
    }
}