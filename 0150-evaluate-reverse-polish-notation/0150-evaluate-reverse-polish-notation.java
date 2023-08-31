class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String c : tokens){
            int a, b;
            switch(c){
                case "+" : 
                    stack.push(stack.pop() + stack.pop()); break;
                case "*" : 
                    stack.push(stack.pop() * stack.pop()); break;
                case "-" : 
                    a = stack.pop(); b = stack.pop();
                    stack.push(b - a); break;
                case "/" : 
                    a = stack.pop(); b = stack.pop();
                    stack.push(b / a); break;                 
                default : stack.push(Integer.parseInt(c)); break;
            }
        }
        return stack.pop();
    }
    
}