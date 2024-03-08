class Solution {
    public String reverseOnlyLetters(String str) {
         char[] ch = str.toCharArray();
	        int i = 0;
	        int j = ch.length - 1;
	        while (i <= j) {
	            if (!((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z'))) {
	                i++; // Skip non-alphabetical characters
	            } else if (!((ch[j] >= 'a' && ch[j] <= 'z') || (ch[j] >= 'A' && ch[j] <= 'Z'))) {
	                j--; // Skip non-alphabetical characters
	            } else {
	                // Swap alphabetical characters
	                char temp = ch[i];
	                ch[i] = ch[j];
	                ch[j] = temp;
	                i++;
	                j--;
	            }
	        }
		    String res=new String(ch);
        return res;
        
    }
}