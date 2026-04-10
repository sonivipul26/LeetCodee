class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;

            left++;
            right--;
        }
    //     char[] arr=new char[s.length];
    //     int count=0;
    //     for(int i=s.length-1;i>=0;i--){
    //         arr[count++]=s[i];
    //     }
    //     return arr;
    // }
}
}