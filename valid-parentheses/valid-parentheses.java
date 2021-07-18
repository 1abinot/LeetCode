class Solution {
    
    public boolean checkParantheses(char c1, char c2){
        if(c1=='(' && c2==')')
            return true;
        else if(c1=='[' && c2==']')
            return true;
        else if(c1=='{' && c2=='}')
            return true;
        else
            return false;
    }
    public boolean isValid(String s) {
        
        if(s.length()==0 || s==null)
            return false;
        
        Stack<Character> parantheses = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                parantheses.push(s.charAt(i));
            else
                if(!parantheses.empty() && checkParantheses(parantheses.peek(), s.charAt(i)))
                    parantheses.pop();
                else
                    return false;
                
        }
        return parantheses.empty();
        
        
    }
}