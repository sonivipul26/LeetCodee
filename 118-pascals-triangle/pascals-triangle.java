class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalResult=new ArrayList<>();
        if(numRows==0){
            return finalResult;
        }
        ArrayList<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        finalResult.add(firstRow);
        if(numRows==1){
            return finalResult;
        }
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow=finalResult.get(i-1);
            ArrayList<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=0;j<i-1;j++){
                row.add(prevRow.get(j)+prevRow.get(j+1));
            }
            row.add(1);
            finalResult.add(row);
        }
        return finalResult;
    }
}