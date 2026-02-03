class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        if(len<=2){
            return len;
        }
        int count=2;
        for(int i=2;i<len;i++){
            if(nums[i]!=nums[count-2]){
                nums[count]=nums[i];
                count++;
            }
            
        }
        return count;
    }
}