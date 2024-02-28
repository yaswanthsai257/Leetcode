class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a=0;
        int b=0;
        int max=0;
        HashSet<Character> hash=new HashSet<>();
        while(b<s.length())
        {
            if(!hash.contains(s.charAt(b)))
            {
                hash.add(s.charAt(b));
                b++;
                max=Math.max(max,hash.size());
            }
            else
            {
                hash.remove(s.charAt(a));
                a++;
            }

        }
        return max;
    }
}