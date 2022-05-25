class Solution {
    public boolean isValid(String s) {
        
        int len = s.length();
        if(len%2 != 0) return false;
        
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray())
        {
            switch(c)
            {
                case ')': if(stack.empty() || stack.pop() != '(')  return false;
                          break;
                
                case '}': if(stack.empty() || stack.pop() != '{')  return false;
                          break;
                    
                case ']': if(stack.empty() || stack.pop() != '[')  return false;
                          break;
                
                default: stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}
