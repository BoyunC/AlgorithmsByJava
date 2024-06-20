class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length != arr2.length){
            answer = arr1.length > arr2.length ? 1 : -1;
        } else { 
            int cnt1 = 0, cnt2 = 0;
            
            for (int n : arr1)
                cnt1 += n;
            
            for (int n : arr2)
                cnt2 += n;
        
            answer =  cnt1 >= cnt2 ? ( cnt1 == cnt2 ? 0 :  1) : -1;
        }
        
        return answer;
    }
}