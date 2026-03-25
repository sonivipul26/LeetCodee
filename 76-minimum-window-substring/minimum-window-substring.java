class Solution {
    public String minWindow(String s, String t) {
        int[] freq= new int[256];
        int low=0;
        int count=t.length();
        int temp=0;
        int min=Integer.MAX_VALUE;

        for(char ch: t.toCharArray()){
            freq[ch]++;
        }

        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            if(freq[ch]>0){
                count--;
            }
            freq[ch]--;

            while(count==0){
                int len=high-low+1;                
                if(len<min){
                    min=len;
                    temp=low;
                }
                char left=s.charAt(low);
                freq[left]++;

                if(freq[left]>0){
                    count++;
                }
                low++;

            }
        }
            if (min == Integer.MAX_VALUE) {
                return "";
            } else {
                return s.substring(temp, temp + min);
            }
    
}
}