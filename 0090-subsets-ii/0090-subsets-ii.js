/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsetsWithDup = function(nums) {
    let ans = [];
    let path = [];
    nums.sort((a,b) => a-b);
    function backtrack(start) {
        ans.push([...path]);

        for(let i = start; i< nums.length; i++){
            if(i>start && nums[i] === nums[i - 1]) continue;
            path.push(nums[i]);
            backtrack(i +1);
            path.pop();
        }
    }
    backtrack(0);
    return ans;
}