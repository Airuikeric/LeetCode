/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let count = 0;
    let result = 0;
    
    // iterate through the array
    for (let num of nums) {
        // if count is 0, set the current element as the majority candidate
        if (count === 0) {
            result = num;
        }
        
        // Adjust the count
        if (num !== result) {
            count--;
        } else {
            count++;
        }
    }
    return result;
};