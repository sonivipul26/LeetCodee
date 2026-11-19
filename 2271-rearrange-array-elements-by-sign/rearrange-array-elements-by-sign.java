class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positiveList=new ArrayList<>();
        ArrayList<Integer> negetiveList=new ArrayList<>();
        for(int num:nums){
            if(num>0){
                positiveList.add(num);
            }else{
                negetiveList.add(num);
            }
        }
        int arr[]=new int[nums.length];
        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i+=2){
            arr[i]=positiveList.get(p);
            arr[i+1]=negetiveList.get(n);
            p++;
            n++;
        }
        return arr;
    }
}