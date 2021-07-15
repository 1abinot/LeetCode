class Solution {
    public int reverse(int x) {
        int rev=0;
        int check_overflow=0;
        while(x != 0){
            check_overflow=rev;
            rev = rev * 10 + x % 10;
            if(check_overflow != rev/10) 
                return 0;
            x/=10;
        }
        return rev;
    }
}
​
/* 
    if(check_overflow != rev/10) 
    When the number overflow it will get a random value , so if we divide it by 10 it can never be the same as it was before the overflow!
*/
​
​
