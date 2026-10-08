var expect = function(val) {
    return {
        toBe: (x) => {
            if (val !== x) throw new Error("Not Equal");
            return true;
        },
        notToBe: (x) => {
            if (val === x) throw new Error("Equal");
            return true;
        }
    };
};