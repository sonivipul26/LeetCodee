class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[256];
        int low=0;
        int maxlen=0;
        int maxfreq=0;
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            freq[ch]++;

            if(freq[ch]>maxfreq){
                maxfreq=freq[ch];
            }
            while((high-low+1)-maxfreq>k){
                freq[s.charAt(low)]--;
                low++;
            }
            int len=high-low+1;
            if(len>maxlen){
                maxlen=len;
            }
        }
        return maxlen;
    }
}