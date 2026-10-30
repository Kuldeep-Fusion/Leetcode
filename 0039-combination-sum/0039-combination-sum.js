/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */

var combinationSum = function(candidates, target) {
    let ans = [];

    function solve(idx, target, list) {
        if (target === 0) {
            ans.push([...list]);
            return;
        }
        for (let i = idx; i < candidates.length; i++) {
            if (target - candidates[i] >= 0) {
                list.push(candidates[i]);
                solve(i, target - candidates[i], list);
                list.pop();
            }
        }
    }

    solve(0, target, []);
    return ans;
};
