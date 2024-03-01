class Solution {
    public int trap(int[] a) {
        int i = 0;
        int j = a.length - 1;
        int l = 0;
        int r = 0;
        int water = 0;
        
        while (i < j) {
            if (a[i] <= a[j]) {
                if (a[i] >= l) {
                    l = a[i];
                } else {
                    water += l - a[i];
                }
                i++;
            } else {
                if (a[j] >= r) {
                    r = a[j];
                } else {
                    water += r - a[j];
                }
                j--;
            }
        }
        
        return water;
    }
}
