/**
 * @param {character[]} chars
 * @return {number}
 */
var compress = function(chars) {
    let index = 0;
    let curr = chars[0];
    let count = 1;

    for (let i = 1; i < chars.length; i++) {
        if (chars[i] !== curr) {
            chars[index++] = curr;
            if (count !== 1) {
                const countArr = count.toString().split('');
                for (let c of countArr) {
                    chars[index++] = c;
                }
            }
            count = 1;
            curr = chars[i];
        } else {
            count++;
        }
    }

    chars[index++] = curr;
    if (count != 1) {
        const countArr = count.toString().split('');
        for (let c of countArr) {
            chars[index++] = c;
        }
    }
    return index;
};
// time complexity: O(n)
// space complexity: O(1)