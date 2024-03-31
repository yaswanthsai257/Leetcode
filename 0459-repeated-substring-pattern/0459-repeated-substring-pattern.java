class Solution {
    public boolean repeatedSubstringPattern(String a) {
          int len = a.length();
        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {
                int num = len / i;
                String str = a.substring(0, i);
                StringBuilder res = new StringBuilder();
                for (int j = 0; j < num; j++) {
                    res.append(str);
                }
                if (res.toString().equals(a)) {
                    return true;
                }
            }
        }
        return false;
    }
}