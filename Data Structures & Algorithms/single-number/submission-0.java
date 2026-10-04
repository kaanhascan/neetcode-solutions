class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int a : nums){
            if(set.contains(a)) set.remove(a);
            else set.add(a);
        }
        return set.iterator().next();
    }
}
