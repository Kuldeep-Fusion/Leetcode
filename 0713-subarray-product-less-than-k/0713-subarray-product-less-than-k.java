class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        int p =1 , si =0, ei = 0;
        while(ei<nums.length){
            //window grow
            p = p*nums[ei];
            //windoe shrink
            while(p >= k && si <= ei){
             p = p/ nums[si];
            si++;
            }
        //update ans
        ans +=(ei -si + 1);
        ei++;
    }
    return ans; 
  }
}