class Solution {
    public String reverseVowels(String s) {
        String vowels="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                vowels+=c;
            }
        }
        String newString="";
        int temp=vowels.length()-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                newString+=vowels.charAt(temp--);
            }else{
                newString+=c;
            }
        }
        return newString;
    }
        public boolean isVowel(char c){
            c=Character.toLowerCase(c);
            return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
        }
}