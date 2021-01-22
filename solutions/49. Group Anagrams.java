class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> word = new HashMap<>();
        
        for(String s: strs){
            char[] c = s.toCharArray();
            
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!word.containsKey(key)) word.put(key, new ArrayList());
            word.get(key).add(s);
        }
        
        return new ArrayList(word.values());
    }
}
