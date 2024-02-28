class Solution {
    public String gcdOfStrings(String str, String str1) {
       if(str1.length()>str.length())
       {
           return gcdOfStrings(str1, str);
       }
       if(str.equals(str1))
       {
           return str1;
       }
       if(str.startsWith(str1))
       {
           return gcdOfStrings(str.substring(str1.length()),str1);
       }
       return "";
    }
}