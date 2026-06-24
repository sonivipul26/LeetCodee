class Solution {
    public int romanToInt(String s) {
        int num=0;
        for(int i=0;i<s.length();i++){
            int curr=0;
            char ch=s.charAt(i);
            if(ch=='I'){
                curr=1;
            }else if(ch=='V'){
                curr=5;
            }else if(ch=='X'){
                curr=10;
            }else if(ch=='L'){
                curr=50;
            }else if(ch=='C'){
                curr=100;
            }else if(ch=='D'){
                curr=500;
            }else if(ch=='M'){
                curr=1000;
            }

            if(i<s.length()-1){
                int next=0;
                char ch2=s.charAt(i+1);
                if(ch2=='I'){
                next=1;
            }else if(ch2=='V'){
                next=5;
            }else if(ch2=='X'){
                next=10;
            }else if(ch2=='L'){
                next=50;
            }else if(ch2=='C'){
                next=100;
            }else if(ch2=='D'){
                next=500;
            }else if(ch2=='M'){
                next=1000;
            }
            if(curr<next){
                num-=curr;
            }else{
                num+=curr;
            }
            }
            else{
                num+=curr;
            }
        }
        return num;
    }
}