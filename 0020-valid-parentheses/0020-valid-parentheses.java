class Solution {
    public boolean isValid(String str) {
         Stack<Character> stack=new Stack<>();
	        for(int i=0;i<str.length();i++) {
	        	char ch=str.charAt(i);
	        	if(ch=='{') {
	        		stack.push('}');
	        	}
	        	else if(ch=='(') {
	        		stack.push(')');
	        	}
	        	else if(ch=='[') {
	        		stack.push(']');
	        	}
	        	else if(stack.isEmpty()||stack.pop()!=ch) {
	        		return false;
	        	}
	        }
	       return stack.isEmpty();
	        

        
    }
}