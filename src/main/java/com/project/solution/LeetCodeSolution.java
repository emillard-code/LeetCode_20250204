package com.project.solution;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] nums1 = new int[]{10,20,30,5,10,50};
        System.out.println(maxAscendingSum(nums1));

        int[] nums2 = new int[]{10,20,30,40,50};
        System.out.println(maxAscendingSum(nums2));

        int[] nums3 = new int[]{12,17,15,13,10,11,12};
        System.out.println(maxAscendingSum(nums3));

    }

    public static int maxAscendingSum(int[] nums) {

        int maxSum = 0;

        // Outer loop to start from each element in the array
        for (int startIdx = 0; startIdx < nums.length; startIdx++) {

            int currentSubarraySum = nums[startIdx];

            // Inner loop to check the next elements forming an ascending subarray
            for (int endIdx = startIdx + 1; endIdx < nums.length && nums[endIdx] > nums[endIdx - 1]; endIdx++) {
                currentSubarraySum += nums[endIdx];
            }

            // Update maxSum if we find a larger ascending subarray sum
            maxSum = Math.max(maxSum, currentSubarraySum);

        }

        return maxSum;

    }

}
