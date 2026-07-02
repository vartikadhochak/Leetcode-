class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int low=0;
        int high=0;
        int maxLen=0;

        while(high<nums.length){
            if(nums[high]==0){
                //reset the window
                low=high+1;
            }else{
                maxLen=Math.max(maxLen,high-low+1);
            }
            high++;
        }return maxLen;
    }
}