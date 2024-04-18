class Solution {
    public int palin(String s, int i, int j) {
        int count = 0;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }
        return count;
    }

    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += palin(s, i, i);     // odd length palindromes
            count += palin(s, i, i + 1); // even length palindromes
        }

        return count;
    }
}
