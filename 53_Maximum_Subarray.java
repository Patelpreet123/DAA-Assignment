class Solution {
    public int maxSubArray(int[] nums) {
        int s=0;
        int m=nums[0];
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
            if(s>m){
                m=s;
            }
            if(s<0){
                s=0;
            }
        }
        return m;
    }
}
