class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int[] result = new int[digits.length];
        for(int i = digits.length - 1; i>=0; i--){
            if(i == digits.length - 1){
                if(digits[i] == 9){
                    if(i == 0){
                        int[] temp = result;
                        result = new int[result.length+1];
                        result[0] = 1;
                        result[1] = 0;
                        for(int j = 2; j<temp.length; j++){
                            result[j] = temp[j];
                        }        
                    }
                    else{
                        carry = 1;
                        result[i] = 0;                        
                    }
                    
                }
                else result[i] = digits[i]+1;
            }
            else{
                if(carry == 1 && digits[i] == 9){
                    if(i == 0){
                        int[] temp = result;
                        result = new int[result.length+1];
                        result[0] = 1;
                        result[1] = 0;
                        for(int j = 2; j<temp.length; j++){
                            result[j] = temp[j];
                        }    
                    }else{
                        result[i] = 0;
                    }
                      
                }
                else if(carry == 1 && digits[i] != 9){
                    result[i] = digits[i]+1;
                    carry = 0;
                }
                else result[i] = digits[i];
            }
        }
    return result;
    }
}
