class Solution {
    public int strStr(String haystack, String needle) {
        int len_haystack=haystack.length();
        int len_needle=needle.length();
        int index=-1;
        for(int i=0;i<=(len_haystack-len_needle);i++){
            boolean result=true;
            for(int j=0;j<len_needle;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    result=false;
                    break;
                }
            }
            if(result==true){
                index=i;
                break;
            }
        }
        return index;
    }
}