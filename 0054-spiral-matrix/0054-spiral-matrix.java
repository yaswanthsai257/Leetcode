class Solution {
    public List<Integer> spiralOrder(int[][] ar) {
         List<Integer> arr = new ArrayList<>();
        if (ar == null || ar.length == 0 || ar[0].length == 0)
            return arr;

        int row_begin = 0;
        int col_begin = 0;
        int row_end = ar.length - 1;
        int col_end = ar[0].length - 1;

        while (row_begin <= row_end && col_begin <= col_end) {
            // Traverse right
            for (int j = col_begin; j <= col_end; j++) {
                arr.add(ar[row_begin][j]);
            }
            row_begin++;

            // Traverse down
            for (int j = row_begin; j <= row_end; j++) {
                arr.add(ar[j][col_end]);
            }
            col_end--;

            // Traverse left
            if (row_begin <= row_end) {
                for (int j = col_end; j >= col_begin; j--) {
                    arr.add(ar[row_end][j]);
                }
            }
            row_end--;

            // Traverse up
            if (col_begin <= col_end) {
                for (int j = row_end; j >= row_begin; j--) {
                    arr.add(ar[j][col_begin]);
                }
            }
            col_begin++;
        }

        return arr;
    }
}