class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        if(nums.length == 0 || nums==null)
            return k;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[k]){
                if(nums[i] != nums[k]){
                    k++;
                    nums[k] = nums[i];
                }
            }
        }
        return k+1;
    }
}