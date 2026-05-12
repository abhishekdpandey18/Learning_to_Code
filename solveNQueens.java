class Solution {
     List<List<String>> ans = new ArrayList<>();
     public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        createBoard(board, n);
        solve(board, 0, n);
        return ans;
    }

    void createBoard(char[][] board, int n) { // fill with dots
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }
    }
    void solve(char[][] board, int row, int n) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                solve(board, row + 1, n);
                board[row][col] = '.';
            }
        }
    }

boolean isSafe(char[][] board, int row, int col, int n){

        for(int i = 0; i < row; i++){ // check q in till those condinates
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){ // check upper left diagonal
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row, j=col; i>=0 && j<n; i--, j++){ // check upper right diagonal
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }  
}
