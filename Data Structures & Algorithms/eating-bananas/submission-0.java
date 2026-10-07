class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int pile : piles){
            right = Math.max(pile,right);
        }
        for (int pile : piles) {
            right = Math.max(pile, right);
        }

        while (left < right) {

            int mid = (left + right) / 2;
            int hours = 0;

            for (int i = 0; i < piles.length; i++) {
                if (piles[i] % mid == 0) {
                    hours += piles[i] / mid;
                } else {
                    hours += (piles[i] / mid) + 1;
                }
            }

            if (hours <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
