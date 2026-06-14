package arraysTheory;

public class MaximumProductSubarray {

    public static void main(String[] args) {

        int[] nums = {-4, -3, -2};
        int[] nums1 = {2, 3, -2, 4};
        int[] nums2 = {-2, 0, -1};

        class Solution {

            public int maxProduct(int[] nums) {
                if (nums == null || nums.length == 0) {
                    return 0;
                }

                int minProduct = nums[0];
                int maxProduct = nums[0];

                int results = nums[0];

                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] >= 0) {
                        maxProduct = Math.max(nums[i], maxProduct * nums[i]);
                        minProduct = Math.min(nums[i], minProduct * nums[i]);
                    } else {
                        int temp = maxProduct;
                        maxProduct = Math.max(nums[i], minProduct * nums[i]);
                        minProduct = Math.min(nums[i], temp * nums[i]);
                    }
                    results = Math.max(results, maxProduct);
                }
                return results;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(nums));
        System.out.println(solution.maxProduct(nums1));
        System.out.println(solution.maxProduct(nums2));
    }

}
