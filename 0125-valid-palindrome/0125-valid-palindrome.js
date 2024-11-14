/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    if (s === null || s.length === 0) return true;

    let left = 0;
    let right = s.length - 1;

    while (left < right) {
        while (left < right && !isLetterOrDigit(s[left])) left++;
        while (left < right && !isLetterOrDigit(s[right])) right--;

        if (s[left].toLowerCase() !== s[right].toLowerCase()) return false;

        left++;
        right--;
    }

    return true;
};

// Helper function to check if a character is alphanumeric
function isLetterOrDigit(char) {
    return /[a-zA-Z0-9]/.test(char);
}