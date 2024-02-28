class Solution {
    public String mergeAlternately(String str, String str1) {
        StringBuilder res = new StringBuilder();
        
        int minLength = Math.min(str.length(), str1.length());

        for (int i = 0; i < minLength; i++) {
            char ch = str.charAt(i);
            char ch1 = str1.charAt(i);
            res.append(ch).append(ch1);
        }
        if (str.length() > minLength) {
            res.append(str.substring(minLength));
        } else if (str1.length() > minLength) {
            res.append(str1.substring(minLength));
        }

        return res.toString();
    }
}