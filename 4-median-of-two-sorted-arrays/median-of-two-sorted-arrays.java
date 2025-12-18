class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
      
        int[] merged = new int[len1 + len2];
    
        for (int i = 0; i < len1; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < len2; i++) {
            merged[len1 + i] = nums2[i];
        }
        int size = len1 + len2;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (merged[i] > merged[j]) {
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }

        if (size % 2 == 1) {
            return merged[size / 2];
        } else {
            return (merged[size / 2 - 1] + merged[size / 2]) / 2.0;
        }
    }
}