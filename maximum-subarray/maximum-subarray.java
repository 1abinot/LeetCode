class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 || nums==null)
            return 0;
        
        
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i < nums.length; i++){
            sum = 0;
            for(int j=i; j < nums.length; j++){
                sum += nums[j];         
                if(sum > maxSum)
                    maxSum = sum;            
            }
        }
        return maxSum;
    }
}