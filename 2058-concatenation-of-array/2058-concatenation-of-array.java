class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int a[]=new int[n];
        for(int i=0;i<n/2;i++){ 
            a[i]=nums[i];
        }
        int k=0;
        for(int i=n/2;i<n;i++){
            a[i]=nums[k];
            k++;
        }
        return  a;
    }
}