class Solution {
    public int totalFruit(int[] fruits) {
        int[] freq = new int[100000];
        int left=0;
        int unique=0;
        int maxLen=-1;
        for(int right=0;right<fruits.length;right++){
            int fruit=fruits[right];
            
            if(freq[fruit]==0){
                unique++;
            }
            freq[fruit]++;
            
            while(unique>2){
                int leftFruit=fruits[left];
                freq[leftFruit]--;

                if(freq[leftFruit]==0){
                    unique--;
                }
                left++;
            }
            int length = right - left+1;
            maxLen = Math.max(maxLen, length);
        }
        return maxLen;
    }
}