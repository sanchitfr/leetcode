        return search(root, word);
    }
    private boolean search(TrieNode root,String word) {
        if(word.length() == 0){
          if(root.isEnd){
              return true;
          }
          return false;
        } 
        
        int childIndex = word.charAt(0) - 'a';
        
        TrieNode child = root.children[childIndex];
        if(child == null) return false;
        
        return search(child, word.substring(1));
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return startsWith(root, prefix);
    }
    private boolean startsWith(TrieNode root, String prefix) {
       if(prefix.length() == 0 && root.isEnd) return true;
        boolean ans = false;
        if(prefix.length() != 0){
            int childIndex = prefix.charAt(0) - 'a';
            TrieNode child = root.children[childIndex];
            //System.out.println(child.data);
            if(child == null) return false;
            ans = startsWith(child, prefix.substring(1));
        }
        else{
            TrieNode child;
            for(int i = 0; i<26; i++){
                child = root.children[i];
                if(child != null){
                    ans = startsWith(child, "");
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return ans;
    }
}
​
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
