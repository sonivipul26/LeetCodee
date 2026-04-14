class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        String s1=s.toLowerCase();
        String newString="";
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(Character.isLetterOrDigit(c)){
                newString+=c;
            }
        }
        int left=0;
        int right=newString.length()-1;
        while(left<right){
            if(newString.charAt(left)!=newString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}