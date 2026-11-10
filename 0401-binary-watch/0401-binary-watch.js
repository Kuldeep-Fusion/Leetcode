/**
 * @param {number} turnedOn
 * @return {string[]}
 */
var readBinaryWatch = function(turnedOn) {
    let ans = []

    for(let h = 0; h < 12; h++){
        for(let m = 0; m < 60; m++){

            let hours = h.toString(2).split("1").length - 1;
            let minutes = m.toString(2).split("1").length - 1;

            if(hours + minutes === turnedOn){
                ans.push(h+ ":" + String(m).padStart(2, "0"));
            }

         }
    }

    return ans;
};