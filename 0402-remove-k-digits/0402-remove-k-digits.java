class Solution {
    public String removeKdigits(String str, int k) {
        int num = str.length();
        if (num == k) return "0";
        
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        
        // If there are still digits to be removed
        while (k > 0) {
            stack.pop();
            k--;
        }
        
        // Construct the result string
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        res.reverse();
        
        // Remove leading zeros
        while (res.length() > 1 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
        
        return res.toString();
    }
}