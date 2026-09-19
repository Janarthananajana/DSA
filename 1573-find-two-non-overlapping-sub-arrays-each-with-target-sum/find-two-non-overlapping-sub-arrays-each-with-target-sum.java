class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = Integer.MAX_VALUE;

        // dp[i] = minimum length of a valid subarray
        // completely inside arr[0 ... i-1]
        int[] dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = INF;
        }

        int left = 0;
        int sum = 0;
        int ans = INF;

        for (int right = 0; right < n; right++) {

            // Add current element
            sum += arr[right];

            // Shrink window if sum becomes too large
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            // Carry forward previous minimum
            dp[right + 1] = dp[right];

            // Found a subarray [left...right]
            if (sum == target) {
                int len = right - left + 1;

                // Previous subarray must end before 'left'
                if (dp[left] != INF) {
                    ans = Math.min(ans, len + dp[left]);
                }

                // Store current subarray as best ending up to right
                dp[right + 1] = Math.min(dp[right + 1], len);
            }
        }

        return ans == INF ? -1 : ans;
    }
}
