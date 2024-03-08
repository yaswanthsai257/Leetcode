import java.util.Map.Entry;
class Solution {
    public int longestSubstring(String s, int k) {
        int len = 0;
        int[] count = new int[26];
        for (int i = 1; i <= 26; i++) {
            Arrays.fill(count, 0);

            int start = 0, end = 0;
            int unique = 0;
            while (end < s.length()) {
                boolean flag = true;
                if (count[s.charAt(end++) - 'a']++ == 0)
                    unique++;

                while (unique > i) {
                    if (count[s.charAt(start++) - 'a']-- == 1)
                        unique--;
                }

                for (int j = 0; j < 26; j++) {
                    if (count[j] > 0 && count[j] < k)
                        flag = false;
                }
                if (flag) {
                    len = Math.max(len, end - start);
                }
            }
        }
        return len;
        
    }
}