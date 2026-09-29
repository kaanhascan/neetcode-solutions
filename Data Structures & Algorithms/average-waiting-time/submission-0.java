class Solution {
    public double averageWaitingTime(int[][] customers) {
        long currtime = 0;
        long waittime = 0;
        for(int i=0;i<customers.length;i++){
            currtime = Math.max(currtime, (long) customers[i][0]) + customers[i][1];
            waittime += currtime - customers[i][0];
        }
        return (double) waittime/customers.length;
    }
}