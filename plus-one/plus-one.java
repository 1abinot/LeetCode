class Solution {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        
        digits[lastIndex] += 1;
        
        for(int i=lastIndex; i>0 && digits[i]==10; --i){
            digits[i] = 0;
            digits[i-1] = digits[i-1] + 1;
        }
        
        int [] resize = new int[digits.length + 1];
        
        if(digits[0] == 10){
            digits[0] = 0;
            for(int i=0;i<digits.length;i++){
                resize[i+1] = digits[i];
            }
            resize[0] = 1;
            
            digits = resize;
        }
        
        return digits;
    }
}