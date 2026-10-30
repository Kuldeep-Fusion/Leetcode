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
        if (idx === candidates.length || target < 0) {
            return;
        }
        list.push(candidates[idx]);
        solve(idx, target - candidates[idx], list);
        list.pop();
        solve(idx + 1, target, list);
    }

    solve(0, target, []);
    return ans;
};