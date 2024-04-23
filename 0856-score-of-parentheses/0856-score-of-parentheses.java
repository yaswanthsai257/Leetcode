class Solution {
    public int scoreOfParentheses(String str) {
        Stack<Integer> stack=new Stack<>();
       int count=0;
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='('){
            stack.push(count);
            count=0;
        }
        else{
           count= stack.pop() + (count==0?1:2*count);

        }
       }
        return count;
    }
}