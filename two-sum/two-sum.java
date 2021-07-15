class Solution {
    public int[] twoSum(int[] nums, int target) {
    
    HashMap<Integer,Integer> visited = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            int complement = target - nums[i];
            
            if(visited.containsKey(complement))
                return new int[]{visited.get(complement),i};
            
            visited.put(nums[i],i);
        }
        throw new IllegalArgumentException("not found");
    }
}