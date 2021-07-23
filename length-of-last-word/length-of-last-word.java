class Solution {
    public int lengthOfLastWord(String s) {
        /*
        String[] words = s.split(" ");
        
        if(words.length==0)
            return 0;
        
        int lastWord = words.length - 1;
        return words[lastWord].length();
        */
        
        
        int length = 0;
        
        if(s.isEmpty())
            return length;
        
        s = s.trim();
        
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' ')
                break;
            length++;
        }
        
        return length;
    }
}