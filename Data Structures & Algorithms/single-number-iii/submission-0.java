class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int a : nums){
            if(set.contains(a)) set.remove(a);
            else set.add(a);
        }
        int[] arr = new int[set.size()];
        int i=0;
        for(int num : set){
            arr[i++] = num;   
        }
        return arr;


    }
}