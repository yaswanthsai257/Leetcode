class Solution {
    public int[] searchRange(int[] a, int k) {
    int[] result = { -1, -1 };
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                if (count == 0) {
                    result[0] = i;
                }
                result[1] = i;
                count++;
            }
        }
            return result;
    }
}