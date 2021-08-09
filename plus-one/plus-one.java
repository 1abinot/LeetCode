class Solution {
    public int[] plusOne(int[] digits) {
        
        // I solution
        /*
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
        */
        
        
        // 2 Solution
        
        int n = digits.length;
        
        for(int i = n-1; i >= 0; --i){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int [] resize = new int[n+1];
        
        for(int i=0;i<n;i++){
            resize[i+1] = digits[i];
        }
        resize[0] = 1;
        digits = resize;
        
        return digits;
    }
}