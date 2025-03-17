package Medium.P2594.MinimumTimeToRepairCars;

class Solution {

    private boolean isJobDone(int[] ranks, int cars, long midTime){
        long totalCarsRepaired = 0;
        for(int rank : ranks){
            long timeDividedByRank = midTime/rank;
            long repairedCars = (long) Math.sqrt(timeDividedByRank);
            totalCarsRepaired += repairedCars;
        }
        return totalCarsRepaired >= cars;


    }

    public long repairCars(int[] ranks, int cars) {
        long minimumTime = 1;
        long maximumTime = Long.MAX_VALUE;
        while (minimumTime < maximumTime){
            long midTime = (maximumTime - minimumTime)/2;
            if(isJobDone(ranks, cars, midTime)){
                maximumTime = midTime;
            } else {
                minimumTime = midTime;
            }

        }
        return minimumTime;
    }
}
