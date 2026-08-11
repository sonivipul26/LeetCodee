class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size=nums.length;
        int[] result=new int[size];
        Arrays.fill(result,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<2*size;i++){
            int idx=i%size;
            while(!stack.isEmpty() && nums[idx]>nums[stack.peek()]){
                int prevIdx=stack.pop();
                result[prevIdx]=nums[idx];
            }
            if(i<size){
                stack.push(idx);
            }
        }
        return result;
    }
}