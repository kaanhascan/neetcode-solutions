class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> seen = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int ot = target-nums[i];
            if(seen.containsKey(ot)){
               return new int[]{seen.get(ot),i}; 
            }
            else{
                seen.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
