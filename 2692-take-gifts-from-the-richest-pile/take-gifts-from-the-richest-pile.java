class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        for(int num:gifts){
            pq.offer(num);
        }
        while(k>0){
            int ele=pq.poll();
            int new_ele=(int)(Math.sqrt(ele));
            pq.offer(new_ele);
            k--;
        }
        long sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}