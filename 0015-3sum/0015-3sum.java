class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
           int j=i+1;
           int k=nums.length-1;
           while(j<k){
            int t=nums[i]+nums[j]+nums[k];
            if(t>0){
                k--;
            }else if(t<0){
                j++;
            }
            else {
                r.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                while(nums[j]==nums[j-1]&& j<k){
                    j++;
                }
            }
            
           }

        }
        return r;
    }
}
