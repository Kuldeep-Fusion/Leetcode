/**
 * @param {number[]} nums
 * @return {boolean}
 */
var isGoodArray = function(nums) {

    function gcd(a,b){
        if(b === 0) return a;

        return gcd(b, a % b);
    }

    let ans = nums[0];

    for(let i = 1; i< nums.length; i++){
        ans = gcd(ans, nums[i]);
    }

    return ans === 1;
};