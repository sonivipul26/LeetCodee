class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> queue=new ArrayDeque<>();
        for(int i=0;i<tickets.length;i++){
            queue.add(new int[]{tickets[i],i});
        }
        int time=0;
        while(!queue.isEmpty()){
            int[] arr=queue.poll();
            arr[0]--;
            time++;

            if(arr[0]>0){
                queue.add(arr);
            }
            if(arr[0]==0 && arr[1]==k){
                return time;
            }
        }
        return time;
    }
}