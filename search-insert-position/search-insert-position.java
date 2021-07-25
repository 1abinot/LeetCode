class Solution {
    public int searchInsert(int[] nums, int target) {
        
/*************I solution*///////////////////
        
/*        if(nums.length==0 || nums==null)
            return 0;
        
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target)
                return i;
            else if(nums[i] > target)
                return i;
        }
        
        return nums.length;
*/
        
        
        
        if(nums.length==0 || nums==null)
            return 0;
        
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= target)
                return i;
        }
        
        return nums.length;
        
    }
}