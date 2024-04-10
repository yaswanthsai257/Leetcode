class Solution {
    public boolean isPalindrome(int x) {
     StringBuilder str=new StringBuilder(String.valueOf(x));

     if(str.toString().equals(str.reverse().toString())){
        return true;
     }
     return false;
        
    }
}