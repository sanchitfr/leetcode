class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" ");
        if(pattern.length() != sArr.length) return false;
        HashMap<Character, String> map = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char patternChar = pattern.charAt(i); 
            if(!map.containsKey(patternChar)){
                if(map.containsValue(sArr[i])) return false;
                map.put(patternChar, sArr[i]);
                
            }
            else if(!map.get(patternChar).equals(sArr[i])) return false;
        }

        return true;
    }
}