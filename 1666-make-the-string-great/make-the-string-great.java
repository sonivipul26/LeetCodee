class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean found=false;
            
            if(!stack.isEmpty()){
                char top=stack.peek();
                if(Math.abs(top-ch)==32){
                    stack.pop();
                    found=true;
                }
            }
            if(!found){
                stack.push(ch);
            }
        }
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();
    }
}