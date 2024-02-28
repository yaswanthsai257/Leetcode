class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] a=new int[26];
        int[] a1=new int[26];
        for(int i=0;i<word1.length();i++)
        {
            a[word1.charAt(i)-'a']++;
        }
        for(int i=0;i<word2.length();i++)
        {
            a1[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;++i)
        {
            if((a[i]>0&&a1[i]==0)||(a1[i]>0&&a[i]==0))
            {
                return false;
            }
        }
        Arrays.sort(a);
        Arrays.sort(a1);
        for(int i=0;i<26;++i)
        {
            if(a[i]!=a1[i])
            {
                return false;
            }
        }
        return true;
        
    }
}