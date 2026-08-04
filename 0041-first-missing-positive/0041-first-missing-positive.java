class Solution {
    public int firstMissingPositive(int[] nums) {
        int j=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                continue;
            }
            else if(nums[i]<j){
                continue;
            }
            else if(nums[i]==j){
                
                j++;
            }
            else {
                break;
            }
        }
        return j;
    }
}