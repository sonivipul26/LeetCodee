class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int maxDiff=1000000;
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int total=nums[i]+nums[left]+nums[right];
                int diff=Math.abs(target-total);
                if(maxDiff>diff){
                    maxDiff=diff;
                    sum=total;
                }
                else if(total==target){
                    return sum;
                }
                else if(total<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return sum;
    }
}