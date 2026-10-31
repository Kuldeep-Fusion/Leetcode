/**
 * @param {number} k
 * @param {number} n
 * @return {number[][]}
 */

var combinationSum3 = function(k, n) {
    let ans = [];
    function solve(idx, sum, list) {
        if (list.length === k && sum === n) {
            ans.push([...list]);
            return;
        }
        if (list.length >= k || sum >= n) {
            return;
        }
        for (let i = idx; i <= 9; i++) {
            list.push(i);
            solve(i + 1, sum + i, list);
            list.pop();
        }
    }

    solve(1, 0, []);
    return ans;
};