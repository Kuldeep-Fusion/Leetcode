/**
 * @param {character[][]} board
 * @param {string} word
 * @return {boolean}
 */

var exist = function(board, word) {

    let m = board.length;
    let n = board[0].length;

    function solve(i, j, idx) {

        if (idx === word.length) return true;

        if (i < 0 || j < 0 || i >= m || j >= n ||
            board[i][j] !== word[idx]) {
            return false;
        }

        let ch = board[i][j];
        board[i][j] = '#';

        let found =
            solve(i + 1, j, idx + 1) ||
            solve(i - 1, j, idx + 1) ||
            solve(i, j + 1, idx + 1) ||
            solve(i, j - 1, idx + 1);

        board[i][j] = ch;

        return found;
    }

    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {

            if (solve(i, j, 0)) {
                return true;
            }
        }
    }

    return false;
};
