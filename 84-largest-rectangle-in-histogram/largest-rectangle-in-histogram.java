class Solution {
    public int largestRectangleArea(int[] heights) {
        int size=heights.length;
        int maxArea=0;
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<=size;i++){
            int currentHeight;
            if(i==size){
                currentHeight=0;
            }else{
                currentHeight=heights[i];
            }

            while(!stack.isEmpty() && currentHeight<heights[stack.peek()]){
                int heightIdx=stack.pop();
                int height=heights[heightIdx];
                int right=i;
                int left;
                if(stack.isEmpty()){
                    left=-1;
                }else{
                    left=stack.peek();
                }
                int width=right-left-1;
                int area=height*width;
                maxArea=Math.max(area,maxArea);
            }

            if(i<size){
                stack.push(i);
            }
        }
        return maxArea;
    }
}