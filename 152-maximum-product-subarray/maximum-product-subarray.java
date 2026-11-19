class Solution {
    public int maxProduct(int[] nums) {
        int max=-99999;
        for(int i=0;i<nums.length;i++){
            int curr=1;
            for(int j=i;j<nums.length;j++){
                curr=curr*nums[j];
                max=Math.max(max,curr);
            }
        }
        return max;
    }
}