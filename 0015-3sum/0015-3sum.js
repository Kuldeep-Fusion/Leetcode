/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    nums.sort((a, b) => a - b);

    let ans = [];

    for(let i = 0; i < nums.length - 2; i++) {

        if(i > 0 && nums[i] == nums[i-1]) continue;

        let si = i + 1;
        let ei = nums.length - 1;

        while(si < ei) {

            let sum = nums[i] + nums[si] + nums[ei];

            if(sum == 0) {
                ans.push([nums[i], nums[si], nums[ei]]);

                si++;
                ei--;

                while(si < ei && nums[si] == nums[si-1]) si++;
                while(si < ei && nums[ei] == nums[ei+1]) ei--;
            }
            else if(sum < 0) {
                si++;
            }
            else {
                ei--;
            }
        }
    }

    return ans;
};

