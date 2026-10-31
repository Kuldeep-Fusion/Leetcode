/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(arr, target) {
    let map = new Map();

    for(let i = 0; i < arr.length; i++) {
        let req = target - arr[i];

        if(map.has(req)) {
            return [map.get(req), i];
        } else {
            map.set(arr[i], i);
        }
    }
};