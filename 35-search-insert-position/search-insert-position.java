class Solution {
    public int searchInsert(int[] nums, int target) {
        int temp=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                temp=i;
                break;
            }else if(nums[i]>target){
                temp=i;
                break;
            }
        }
        if(temp==-1){
            temp=nums.length;
        }
        return temp;
    }
}