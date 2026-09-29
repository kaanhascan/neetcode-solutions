class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();

        for(int a : nums){
            set.add(a);
        }
        int highest = 0;

        for(int num : set){
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                highest = Math.max(highest, length);
            }
        }

        return highest;


    }
}
