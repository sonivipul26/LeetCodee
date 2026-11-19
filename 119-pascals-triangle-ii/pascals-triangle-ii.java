class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0){
            List<Integer> result=new ArrayList<>();
            result.add(1);
            return result;
        }
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        for(int i=0;i<=rowIndex;i++){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            for(int j=0;j<i-1;j++){
                list.add(ans.get(j)+ans.get(j+1));
            }
            list.add(1);
            ans = list;
        }
        return ans;
    }
}