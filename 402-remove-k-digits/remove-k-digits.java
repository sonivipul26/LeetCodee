class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb= new StringBuilder();
        int size=num.length();
        if(size==k){
            return "0";
        }
        for(int i=0;i<size;i++){
            char ch=num.charAt(i);
            while(!stack.isEmpty() && k>0 && stack.peek()>ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}