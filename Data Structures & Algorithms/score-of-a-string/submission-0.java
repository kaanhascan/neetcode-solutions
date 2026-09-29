class Solution {
    public int scoreOfString(String s) {
        int total = 0;
        char[] a = s.toCharArray();
        for(int i=0;i<a.length-1;i++){
            total += Math.abs((int) a[i+1]-(int) a[i]);
        }
        return total;
    }
}