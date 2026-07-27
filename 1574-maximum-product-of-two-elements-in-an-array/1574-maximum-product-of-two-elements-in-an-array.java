class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int t=nums.length-1;
        int a=(nums[t]-1)*(nums[t-1]-1);
        // int b=nums[0]-1*nu/
        return a;
    }
}