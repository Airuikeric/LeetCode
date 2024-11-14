/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    const count = {}; // character -> count map
    
    // first pass: count the frequency of each character
    for (let c of s) {
        count[c] = (count[c] || 0) + 1;
    }
    
    // second pass: find the first chracter with a count of 1
    for (let i = 0; i < s.length; i++) {
        if (count[s[i]] === 1) {
            return i;
        }
    }
    
    return -1; // return -1 if no unique character is found 
};

// tc: O(n)
// sc: O(1)