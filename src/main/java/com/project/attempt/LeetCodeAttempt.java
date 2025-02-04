package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = new int[]{10,20,30,5,10,50};
        System.out.println(maximumAscendingSubarraySum(nums1));

        int[] nums2 = new int[]{10,20,30,40,50};
        System.out.println(maximumAscendingSubarraySum(nums2));

        int[] nums3 = new int[]{12,17,15,13,10,11,12};
        System.out.println(maximumAscendingSubarraySum(nums3));

    }

    // This method returns the maximum possible sum of an ascending subarray in array nums[].
    public static int maximumAscendingSubarraySum(int[] nums) {

        // int currentSum will keep track of the value of the current subarray while looping through nums[].
        // int maximumSum will keep track of the current highest subarray record while looping through nums[].
        int currentSum = nums[0];
        int maximumSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // We increment int currentSum by the value of the current index if it is ascending.
            // Otherwise, we 'reset' int currentSum to the value of the current index.
            if (nums[i] > nums[i-1]) { currentSum = currentSum + nums[i]; }
            else { currentSum = nums[i]; }

            // And then we check at the end of each loop what the current highest sum achieved is.
            if (currentSum > maximumSum) { maximumSum = currentSum; }

        }

        // At the end of the for-loop, return the maximum sum that had been achieved.
        return maximumSum;

    }

}
