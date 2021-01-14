class Solution {
    public int reverse(int n) {
        int result = 0;
        while(n != 0){
            
            int lastDigit = n%10;
            int newResult = result*10 + lastDigit;
            if((newResult-lastDigit)/10 != result) return 0;
            result = newResult;
            n /=10;
        }
        return result;
    }
}
