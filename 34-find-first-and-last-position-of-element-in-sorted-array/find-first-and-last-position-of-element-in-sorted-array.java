class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=first(nums,target);
        int r=last(nums,target);
        return new int[]{l,r};
    }
    public int first(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+high-low/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1; //left search
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return ans;  
    }
    public int last(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+high-low/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1; //right search
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return ans;
    }
}