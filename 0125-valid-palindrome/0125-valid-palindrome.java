class Solution {
    public boolean isPalindrome(String s) {
        // s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // System.out.println(s);
        // for(int i = 0; i<=s.length()/2; i++){
        //     System.out.println(s.charAt(i) + " " + s.charAt(s.length()-i-1));
        //     if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        // }
        // return true;

        int start=0, end=s.length()-1;

        while(start <= end){
            char first = s.charAt(start);
            char last = s.charAt(end);
            if(!Character.isLetterOrDigit(first)) start++;
            else if(!Character.isLetterOrDigit(last)) end--;
            else{
                if(Character.toLowerCase(first) != Character.toLowerCase(last)) return false;
                start++;
                end--;
            }
        }
        return true;

    }
}