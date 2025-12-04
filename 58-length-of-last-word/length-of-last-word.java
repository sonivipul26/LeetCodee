class Solution {
    public int lengthOfLastWord(String s) {
        String str1=s.trim();
		int space=0;
		int count=0;
		int index=0;
		for(int i=0;i<str1.length();i++){
		    if(str1.charAt(i)==' '){
		        space++;
		        index=i;
		    }
		}
		if(space==0){
		    count=str1.length();
		} else{
		    for(int i=index+1;i<str1.length();i++){
		    count++;
		    }
		}
        return count;
    }
}