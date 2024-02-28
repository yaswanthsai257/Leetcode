class Solution {
    public boolean isAnagram(String str, String str1) {
       char[] ch=str.toCharArray();
        char[] ch1=str1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch);
        String res1="";
        String res2="";
        for(int i=0;i<ch.length;i++){
            res1=res1+ch[i];
        }
        for(int i=0;i<ch1.length;i++){
            res2+=ch1[i];
        }
       if(res1.equals(res2)){
          return true;
       }
       else{
          return false;
       }
        
    }
}