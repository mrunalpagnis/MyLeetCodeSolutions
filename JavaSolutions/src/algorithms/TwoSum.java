package algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers,
 * return indices of the two numbers
 * such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> hashSet = new HashSet<>();
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int length = nums.length;
        int num1 = 0;
        int num2 = 0;
        for (int i=0; i<length; i++) {
            if (hashSet.contains(target - nums[i])) {
                num1 = target - nums[i];
                num2 = nums[i];
                break;
            }
            hashSet.add(nums[i]);
        }

        int []result = new int[2];
        int index = 0;
        for (int i=0; i<length; i++) {
            if (nums[i] == num1) {
                result[index] = i;
                index++;
            } else if (nums[i] == num2) {
                result[index] = i;
                index++;
            }
            if (index == 2) {
                break;
            }
        }
        return result;
    }
}
