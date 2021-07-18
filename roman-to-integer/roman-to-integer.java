class Solution {
    public int romanToInt(String s) {
        if(s.length()==0 || s==null)
            return 0;
        
        
        HashMap<Character, Integer> romanValue = new HashMap<>();
        
        romanValue.put('I' , 1);
        romanValue.put('V' , 5);
        romanValue.put('X' , 10);
        romanValue.put('L' , 50);
        romanValue.put('C' , 100);
        romanValue.put('D' , 500);
        romanValue.put('M' , 1000);
        
        
        int length = s.length()-1;  // last character
        int result = romanValue.get(s.charAt(length));     // the value of last character
        
        for(int i=length-1; i>=0; i--){
            if(romanValue.get(s.charAt(i)) >= romanValue.get(s.charAt(i+1)))
                result+=romanValue.get(s.charAt(i));
            else
                result-=romanValue.get(s.charAt(i));
        }
        return result;
    }
}