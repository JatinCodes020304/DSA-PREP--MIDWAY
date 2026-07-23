class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<3)return n;
        int t=1;
        while(t<=n){
            t=t*2;
        }
        return t;
    }
}