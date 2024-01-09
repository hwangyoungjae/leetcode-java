package org.example.p00088_MergeSortedArray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        bubbleSort(nums1);
    }

    private void bubbleSort(int[] array) {
        int cnt = -1;
        while (cnt != 0) {
            cnt = 0;
            for (int i = 1; i < array.length; i++) {
                int x = array[i - 1];
                int y = array[i];
                if (x > y) {
                    cnt++;
                    array[i - 1] = y;
                    array[i] = x;
                }
            }
        }
    }
}
