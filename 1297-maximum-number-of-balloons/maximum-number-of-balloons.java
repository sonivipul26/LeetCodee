class Solution {
    public int maxNumberOfBalloons(String text) {
        boolean[] visit=new boolean[text.length()];
        int ans=0;
        while(true){
            String s="balloon";
            boolean found=true;
            for(char ch: s.toCharArray()){
                boolean flag=false;
                
                for(int i=0;i<text.length();i++){
                    if(!visit[i]&&text.charAt(i)==ch  ){
                        visit[i]=true;
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    found=false;
                    break;
                }
            }
            if(!found){
                break;
            }
                ans++;
        }
        return ans;
    }
}