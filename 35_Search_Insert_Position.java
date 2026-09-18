class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]<=target){
                ans=m;
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        if(ans!=-1&&nums[ans]==target){
            return ans;
        }
        return ans+1;
    }
}
