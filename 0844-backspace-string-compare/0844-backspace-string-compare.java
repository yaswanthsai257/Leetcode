import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String str, String str2) {
        String processedStr1 = processString(str);
        String processedStr2 = processString(str2);
        return processedStr1.equals(processedStr2);
    }
    
    private String processString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
