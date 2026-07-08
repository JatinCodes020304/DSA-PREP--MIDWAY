class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0;
        int c=0;
        for(int n:nums){
            if(n==1){
                c++;
                m=Math.max(m,c);
            }else{
                c=0;
            }
        }
        return m;
    }
}