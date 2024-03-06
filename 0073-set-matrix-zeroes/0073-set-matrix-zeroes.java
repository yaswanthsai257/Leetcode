class Solution {
    public void setZeroes(int[][] matrix) {
        int rowL = matrix.length;
        int col = matrix[0].length;
        int[] row = new int[rowL];
        int[] column = new int[col]; // Fixed declaration of column array
        
        for (int i = 0; i < rowL; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        
        for (int i = 0; i < rowL; i++) {
            for (int j = 0; j < col; j++) {
                if (row[i] == 1 || column[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
