package arraysTheory;

public class MaxSubArray {
// Kadane's algorithm = O(N)
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};

        class Solution {

            public int maxSubArray(int[] nums) {
                int maxSoFar = nums[0];
                int currentSum = nums[0];

                for (int i = 1; i < nums.length; i++) {
                    if (currentSum < 0) {
                        currentSum = 0;
                    }
                    currentSum += nums[i];

                    if (currentSum > maxSoFar) {
                        maxSoFar = currentSum;
                    }
                }
                return maxSoFar;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(nums));
        System.out.println(solution.maxSubArray(nums2));
        System.out.println(solution.maxSubArray(nums3));
    }

}
