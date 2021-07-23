class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        
        if(words.length==0)
            return 0;
        
       
        int lastWord=0;
        for(int i=0;i<words.length;i++){
            lastWord = i;
        }
        return words[lastWord].length();
    }
}