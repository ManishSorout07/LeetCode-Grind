class Solution {
    public int earliestFinishTime(
            int[] landStartTime,
            int[] landDuration,
            int[] waterStartTime,
            int[] waterDuration) {

        int option1 = calculate(
                landStartTime, landDuration,
                waterStartTime, waterDuration
        );

        int option2 = calculate(
                waterStartTime, waterDuration,
                landStartTime, landDuration
        );

        return Math.min(option1, option2);
    }

    private int calculate(
            int[] start1, int[] dur1,
            int[] start2, int[] dur2) {

        int firstEnd = Integer.MAX_VALUE;

        // Earliest finishing ride from first category
        for (int i = 0; i < start1.length; i++) {
            firstEnd = Math.min(firstEnd, start1[i] + dur1[i]);
        }

        int ans = Integer.MAX_VALUE;

        // Try every ride from second category
        for (int i = 0; i < start2.length; i++) {
            int finishTime = Math.max(firstEnd, start2[i]) + dur2[i];
            ans = Math.min(ans, finishTime);
        }

        return ans;
    }
}