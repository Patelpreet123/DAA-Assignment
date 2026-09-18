class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        int s=1;
        int e=nums.length-2;
        int m;
        while(s<=e){
            m=(s+e)/2;
            if(nums[m]>nums[m-1]&&nums[m]>nums[m+1]){
                return m;
            }
            else if(nums[m]<nums[m+1]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return 1;
    }
}
