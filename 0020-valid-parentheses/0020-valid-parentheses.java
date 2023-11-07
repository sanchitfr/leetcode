class Solution {
    public boolean isValid(String s) {
        Stack<Character> para = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '(') para.push(c);
            else if(para.size() == 0) return false;
            else if(c == '}' && para.peek() != '{') return false;
            else if(c == ']' && para.peek() != '[') return false;
            else if(c == ')' && para.peek() != '(') return false;
            else para.pop();
        }
        return para.size() == 0;
    }
}