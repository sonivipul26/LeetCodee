class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]= new int[nums.length];
        int front=0;
        int rear=nums.length-1;
        int j=nums.length-1;
        while(front<=rear){
            if(nums[front]*nums[front]>nums[rear]*nums[rear]){
                arr[j]=nums[front]*nums[front];
                front++;
                j--;      
              }else{
                arr[j]=nums[rear]*nums[rear];
                rear--;
                j--;
              }
        }
        return arr;
       
    }
}