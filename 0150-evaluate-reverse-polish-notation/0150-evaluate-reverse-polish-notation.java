class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        int re = 0;
        for(String c : tokens){
            switch(c){
                case "+" : 
                    stack.push(stack.pop() + stack.pop()); 
                    break;
                case "*" : 
                    stack.push(stack.pop() * stack.pop()); 
                    break;
                case "-" : 
                    int a1 = stack.pop(), b1 = stack.pop();
                    stack.push(b1 - a1); 
                    break;
                case "/" : 
                    int a2 = stack.pop(), b2 = stack.pop();
                    stack.push(b2 / a2); 
                    break;                 
                default : stack.push(Integer.parseInt(c)); 
                    break;
            }
            
        }
        return stack.pop();
    }
}