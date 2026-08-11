class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int val = -1;
            for (int j = 1; j < nums.length; j++) {
                int idx = (i + j) % (nums.length);
                if (nums[idx] > num) {
                    val = nums[idx];
                    break;
                }
            }
            result[i] = val;
        }
        return result;
    }
}