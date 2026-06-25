class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Character> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            return map.get(b)-map.get(a);
        });

        StringBuilder sb=new StringBuilder();
        for(char ch:list){
            int frq=map.get(ch);
            for(int i=0;i<frq;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}