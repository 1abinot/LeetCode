class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        
        if(words.length==0)
            return 0;
        
        int lastWord = words.length - 1;
        return words[lastWord].length();
    }
}