class Solution {
    public int longestSubarray(int[] arr) {
        int left = 0;
int k = 1;
int max = 0;

for (int right = 0; right < arr.length; right++) {

    if (arr[right] == 0)
        k--;

    while (k < 0) {
        if (arr[left] == 0)
            k++;
        left++;
    }

    max = Math.max(max, right - left);
}
 return max;
    }
}