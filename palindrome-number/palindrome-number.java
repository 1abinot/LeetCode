class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        
        int palindrome=0;
        int tmp=x;
        while(tmp!=0){
            palindrome = palindrome * 10 + tmp%10;
            tmp/=10;
        }
        
        return palindrome==x;
    }
}