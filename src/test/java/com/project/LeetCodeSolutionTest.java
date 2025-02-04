package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void maxAscendingSumTest() {

        int[] nums1 = new int[]{10,20,30,5,10,50};
        assertEquals(65, LeetCodeSolution.maxAscendingSum(nums1));

        int[] nums2 = new int[]{10,20,30,40,50};
        assertEquals(150, LeetCodeSolution.maxAscendingSum(nums2));

        int[] nums3 = new int[]{12,17,15,13,10,11,12};
        assertEquals(33, LeetCodeSolution.maxAscendingSum(nums3));

    }

}
