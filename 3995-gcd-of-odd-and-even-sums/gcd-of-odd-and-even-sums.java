class Solution {
    public int gcdOfOddEvenSums(int n) {
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int size1=0;
        int size2=0;
        int i=1;
        while (size1 < n || size2 < n) {
            if (i % 2 == 0) {
                if (size1 < n) {
                    arr1[size1++] = i;
                }
            } else {
                if (size2 < n) {
                    arr2[size2++] = i;
                }
            }
            i++;
        }
        int evenSum=0;
        int oddSum=0;
        for(int j=0;j<size1;j++){
            evenSum+=arr1[j];
        }
        for(int j=0;j<size2;j++){
            oddSum+=arr2[j];
        }
        int min=Math.min(evenSum,oddSum);
        for(int j=min;j>=1;j--){
            if(evenSum%j==0 && oddSum%j==0){
                return j;
            }
        }
        return 1;

    }
}