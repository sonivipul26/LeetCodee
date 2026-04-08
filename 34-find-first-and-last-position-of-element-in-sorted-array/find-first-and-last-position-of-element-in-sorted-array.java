class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[nums.length];
        int size=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[size]=i;
                size++;
            }
        }
        if(size==0){
            return new int[]{-1,-1};
        }
        return new int[]{arr[0],arr[size-1]};
    }
}