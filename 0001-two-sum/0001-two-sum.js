/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
     let ans = [];
    
    function solve(idx, target, list) {
        if (target === 0 && list.length === 2 ) {
            ans.push(...list);
            return;
        }
        if (idx === nums.length || list.length === 2) {
            return;
        }

        list.push(idx);
         if (solve(idx + 1, target - nums[idx], list)) {
            return true;
        }

        list.pop();
        solve(idx + 1, target, list);
    }

    solve(0, target, []);
    return ans;
};