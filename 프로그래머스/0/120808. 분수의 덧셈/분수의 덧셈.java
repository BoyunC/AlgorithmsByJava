class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int gcd = getGCD(denom1, denom2);
        int lcm = denom1 * denom2 / gcd; 
        
        answer[0] = ((numer1 * (lcm / denom1)) + (numer2 * (lcm / denom2)));
        answer[1] = lcm;
        
        int ansGcd = getGCD(answer[0], answer[1]);
        
        answer[0] /= ansGcd;
        answer[1] /= ansGcd;
        
        
        return answer;
    }
    
    public int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}