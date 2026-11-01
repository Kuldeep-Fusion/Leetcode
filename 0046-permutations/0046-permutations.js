/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function(nums) {
    let ans = [];

    function backtrack(ques, path) {
        if(ques.length === 0){
            ans.push(path);
            return;
        }
        for(let i = 0; i< ques.length; i++){
            let ch = ques[i];
            let s1 = ques.slice(0, i);
            let s2 = ques.slice(i+1);
            backtrack([...s1, ...s2], [...path, ch]);
        }
    }
    backtrack(nums, []);
    return ans;
}
