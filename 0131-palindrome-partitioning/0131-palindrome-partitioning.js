/**
 * @param {string} s
 * @return {string[][]}
 */
var partition = function(s) {
    let ans = [];
    let path = [];

    function backtrack(start) {
        if (start === s.length) {
            ans.push([...path]);
            return;
        }
        for (let end = start; end < s.length; end++) {
            let sub = s.substring(start, end + 1);

            if (isPalindrome(sub)) {
               
                path.push(sub);
                backtrack(end + 1);
                path.pop();

            }
        }
    }

    backtrack(0);
    return ans;
};


 const  isPalindrome = (str) => {
        let i = 0;
        let j = str.length - 1;

        while (i < j) {
            if (str[i] !== str[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
