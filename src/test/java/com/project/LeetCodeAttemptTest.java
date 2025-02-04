package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void maximumAscendingSubarraySumTest() {

        int[] nums1 = new int[]{10,20,30,5,10,50};
        assertEquals(65, LeetCodeAttempt.maximumAscendingSubarraySum(nums1));

        int[] nums2 = new int[]{10,20,30,40,50};
        assertEquals(150, LeetCodeAttempt.maximumAscendingSubarraySum(nums2));

        int[] nums3 = new int[]{12,17,15,13,10,11,12};
        assertEquals(33, LeetCodeAttempt.maximumAscendingSubarraySum(nums3));

    }

}
