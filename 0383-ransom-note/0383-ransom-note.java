class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(ransomNote.length() > magazine.length()) return false;
        for( char c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c : ransomNote.toCharArray()){
            if(!map.containsKey(c) || map.get(c) < 1) return false;
            else map.put(c, map.get(c)-1);
        }
        return true;
    }
}