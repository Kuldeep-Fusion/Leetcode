/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    let ans = [];

    for (let i = 0; i < nums.length; i++) {
        let count = 0;

        for (let j = 0; j < nums.length; j++) {
            if (nums[i] === nums[j]) {
                count++;
            }
        }
        let found = false;
        for (let j = 0; j < ans.length; j++) {
            if (ans[j][0] === nums[i]) {
                found = true;
                break;
            }
        }
        if (!found) {
            ans.push([nums[i], count]);
        }
    }
    ans.sort((a, b) => b[1] - a[1]);
    return ans.slice(0, k).map(item => item[0]);
};