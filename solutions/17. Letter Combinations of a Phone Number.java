    
    private void backtrack(String combinations, String nextDigits){
        if(nextDigits.length() == 0){
            output.add(combinations);
            return;
        }
        
        String digit = nextDigits.substring(0, 1);
        String keys = phone.get(digit);
        for(int i = 0; i<keys.length(); i++){
            String letter = keys.substring(i,i+1);
            backtrack(combinations+letter, nextDigits.substring(1));
        }
    }
    
    public List<String> letterCombinations(String digits) {
//         List<String> ans = new ArrayList<>();
//         if(digits.length() == 0){
//             return ans;
//         }
//         ans.add("");
//         // letterCombinations(digits, ans);
//         // return ans;
        
//         char[] input = digits.toCharArray();
//         for(char c : input){
//             ans = expand(ans, phone.get("" + c).toCharArray());
//         }
//         return ans;
        
        if(digits.length() != 0){
            backtrack("", digits);
        }
        return output;
    }
}
