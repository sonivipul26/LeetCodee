class Solution {
    public int kthFactor(int n, int k) {
        int[] arr=new int[100];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[index++]=i;
            }
        }
        if(k<=index){
        return arr[k-1];
        }else{
            return -1;
        }
    }
}