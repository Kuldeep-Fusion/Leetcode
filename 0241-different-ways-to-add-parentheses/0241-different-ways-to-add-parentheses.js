/**
 * @param {string} expression
 * @return {number[]}
 */
var diffWaysToCompute = function(expression) {
    let ans = [];

    for (let i = 0; i < expression.length; i++) {
        let ch = expression[i];

        if (ch === '+' || ch === '-' || ch === '*') {

            let left = diffWaysToCompute(expression.substring(0, i));
            let right = diffWaysToCompute(expression.substring(i + 1));

            for (let l of left) {
                for (let r of right) {

                    if (ch === '+') ans.push(l + r);
                    if (ch === '-') ans.push(l - r);
                    if (ch === '*') ans.push(l * r);
                }
            }
        }
    }

    if (ans.length === 0) {
        return [Number(expression)];
    }

    return ans;
};