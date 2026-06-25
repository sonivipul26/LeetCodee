class Solution {
    public int secondHighest(String s) {
        String str="";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                str+=ch;
            }
        }
        int first=-1;
        int second=-1;
        for(char ch:str.toCharArray()){
            int num=ch-'0';
            if(num>first){
                second=first;
                first=num;
            }else if(num!=first && num>second){
                second=num;
            }
        }
        return second;

    }
}