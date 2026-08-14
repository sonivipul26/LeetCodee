class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int count=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char left=s.charAt(i);
                map.put(left,map.get(left)-1);
                i++;
            }
            count=Math.max(count,j-i+1);
            j++;
        }
        return count;
    }
}