class Solution {
    public int earliestFinishTime(
            int[] landStartTime,
            int[] landDuration,
            int[] waterStartTime,
            int[] waterDuration) {

        int landFirst = calculate(
                landStartTime, landDuration,
                waterStartTime, waterDuration);

        int waterFirst = calculate(
                waterStartTime, waterDuration,
                landStartTime, landDuration);

        return Math.min(landFirst, waterFirst);
    }

    private int calculate(
            int[] firstStart,
            int[] firstDuration,
            int[] secondStart,
            int[] secondDuration) {

        int minEnd = Integer.MAX_VALUE;

        for (int i = 0; i < firstStart.length; i++) {
            minEnd = Math.min(minEnd,
                    firstStart[i] + firstDuration[i]);
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < secondStart.length; i++) {
            ans = Math.min(ans,
                    Math.max(minEnd, secondStart[i]) + secondDuration[i]);
        }

        return ans;
    }
}