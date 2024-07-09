class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int x = 0;
        int s = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("x")){

                x += arr[i].equals("x") ? 1 : Integer.parseInt(arr[i].replaceAll("x", ""));
            } else if (!arr[i].equals("+")) {
                
                s += Integer.parseInt(arr[i]);
            }
        }
        
        return x == 0 ? (s == 0 ? "" : s + "" ) : (s == 0 ? (x == 1 ? "x" : x + "x") : (x == 1 ? "x + " + s : x + "x + " + s));
    }
}