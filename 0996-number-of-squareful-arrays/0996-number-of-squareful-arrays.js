/**
 * @param {number[]} nums
 * @return {number}
 */

var numSquarefulPerms = function(nums) {
    nums.sort((a, b) => a - b);

    let used = new Array(nums.length).fill(false);
    let ans = 0;

    function backtrack(count, prev) {

        if (count === nums.length) {
            ans++;
            return;
        }

        for (let i = 0; i < nums.length; i++) {

            if (used[i]) continue;

            // Skip duplicate permutations
            if (i > 0 && nums[i] === nums[i - 1] && !used[i - 1]) {
                continue;
            }

            // Check perfect square
            if (prev !== null) {
                let sum = prev + nums[i];
                let root = Math.sqrt(sum);

                if (!Number.isInteger(root)) continue;
            }

            used[i] = true;

            backtrack(count + 1, nums[i]);

            used[i] = false;
        }
    }

    backtrack(0, null);

    return ans;
};
