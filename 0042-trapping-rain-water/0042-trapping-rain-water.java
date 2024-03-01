class Solution {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1, lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE;
        int res = 0;
        while (l < r) {
        lmax = Math.max(lmax, h[l]);
        rmax = Math.max(rmax, h[r]);
        res += (lmax < rmax) ? lmax - h[l++] : rmax - h[r--];
        }
        return res;
    }
}
