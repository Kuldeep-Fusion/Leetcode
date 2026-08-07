class Solution {
    public int[] singleNumber(int[] nums) {
         int xor = 0;
        for( int i = 0; i<nums.length; i++ ){
            xor = xor ^ nums[i];
        }
        int mask = (xor & (-1 * xor));
        int a =0;
        for(int i =0; i< nums.length; i++){
            if((nums[i] & mask) == 0){
                a ^= nums[i];
            }
        }
        int b = xor ^a;
        int [] ar = {a,b};
        return ar;
    }
}