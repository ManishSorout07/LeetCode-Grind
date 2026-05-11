class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {

            // Convert number to string
            String str = String.valueOf(num);

            // Traverse each digit
            for (char ch : str.toCharArray()) {
                result.add(ch - '0');
            }
        }

        // Convert List<Integer> to int[]
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}