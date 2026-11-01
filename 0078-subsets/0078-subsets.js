/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function(nums) {
    let ans = [];
    let path = [];

    function backtrack(start) {
        ans.push([...path]);

        for(let i = start; i< nums.length; i++){
            path.push(nums[i]);
            backtrack(i +1);
            path.pop();
        }
    }
    backtrack(0);
    return ans;
}