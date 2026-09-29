class Solution {
    public double averageWaitingTime(int[][] customers) {
        long currentTime = 0;
        long waitingTime = 0;
        for (int[] customer : customers) {
            int arrivalTime = customer[0];
            int time = customer[1];

            currentTime = Math.max(currentTime, arrivalTime) + time;

            waitingTime += currentTime - arrivalTime;
        }
        return (double) waitingTime / customers.length;
    }
}