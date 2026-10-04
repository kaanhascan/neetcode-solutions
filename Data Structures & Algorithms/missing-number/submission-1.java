class Solution {
    public int missingNumber(int[] nums) {
        int tot = 0;
        int expectedtot = (nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            tot += nums[i];    
        }
        return expectedtot - tot;
    }
}
