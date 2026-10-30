/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum2 = function(candidates, target) {
    let ans = [];
    candidates.sort((a, b) => a - b);
    function solve(idx, target, list) {
        if (target === 0) {
            ans.push([...list]);
            return;
        }
        for (let i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] === candidates[i-1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            list.push(candidates[i]);
            solve(i + 1, target - candidates[i], list);
            list.pop();
        }
    }

    solve(0, target, []);
    return ans;
};