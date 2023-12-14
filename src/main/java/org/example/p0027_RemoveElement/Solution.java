package org.example.p0027_RemoveElement;

class Solution {

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public int removeElement2(int[] nums, int val) {
        int c = 0;
        for (int num : nums) {
            if (num == val) c++;
        }
        int v;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != val) {
                        v = nums[i];
                        nums[i] = nums[j];
                        nums[j] = v;
                        break;
                    }
                    if (j + 1 == nums.length) {
                        return nums.length - c;
                    }
                }
            }
        }
        return nums.length - c;
    }
}