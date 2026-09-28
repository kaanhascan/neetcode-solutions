class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(seen.containsValue(nums[i])){
                return true;
            }
            seen.put(i,nums[i]);
        }
        return false;
    }
}