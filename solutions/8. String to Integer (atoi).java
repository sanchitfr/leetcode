class Solution {
    public int myAtoi(String s) {
       char[] arr = s.toCharArray();
        
        int index = 0;
        
        for(char i : arr){
            if(i == ' ') index++;
            else break;
        }
        if(index >= arr.length) return 0;
        boolean positive = true;
        
        if(arr[index] == '+'){
            index++;
        }
        else if(arr[index] == '-'){
            positive = false;
            index++;
        }
        int result = 0, overflow = 0;
        while(index < arr.length){
            char c = arr[index];
            
            if(c < '0' || c > '9') break;
            
            int num = c - '0';
            
            result = overflow;
            overflow = overflow * 10 + num;
            
            if(result != overflow/10){
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            index++;
        }
        return positive ? overflow : 0-overflow;
    }
}
                                
