package difficulty.medium;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evaluate_Reverse_Polish_Notation s = new Evaluate_Reverse_Polish_Notation();
		s.evalRPN(new String[]{"3", "-4", "+"});
	}
	
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < tokens.length ; i ++) {
        	String s =  tokens[i];
        	if(Character.isDigit(s.charAt(0)) || s.length() > 1){
                stack.push(Integer.valueOf(s));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int total = 0;
                if(s.charAt(0) == '+'){
                    total = a + b;
                    stack.push(total);
                } else if(s.charAt(0) == '*') {
                    total = a * b;
                    stack.push(total);
                } else if(s.charAt(0) == '-') {
                    total = a - b;
                    stack.push(total);
                } else {
                    total = a / b;
                    stack.push(total);
                }   
            }  
        }
        
        return stack.pop();
    }

}
