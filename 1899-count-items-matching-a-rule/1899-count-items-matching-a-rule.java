class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndexFromKey = 0, ans = 0;

        if(ruleKey.equals("color")) ruleIndexFromKey = 1;
        else if(ruleKey.equals("name")) ruleIndexFromKey = 2;

        for(int i = 0; i<items.size(); i++){
           List<String> list = items.get(i);
           if(list.get(ruleIndexFromKey).equals(ruleValue)) ++ans;
        }
        return ans;
    }
}