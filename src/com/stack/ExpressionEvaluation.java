package com.stack;

/**
 * Program to evaluate the postfix expression.
 */
public class ExpressionEvaluation {
    public static void main(String[] args) {
        System.out.println("Result: " + evaluate("234*+82/-"));
    }

    public static int evaluate(String postfix){
        StackLinkedList stack = new StackLinkedList();

        for(char c : postfix.toCharArray()){
            int conversion = Character.getNumericValue(c);

            if(isOperation(c)){
                int r;
                int y = stack.pop();
                int x = stack.pop();

                switch (c){
                    case '+':
                        r = x + y;
                        stack.push(r);
                        break;

                    case '-':
                        r = x - y;
                        stack.push(r);
                        break;

                    case '*':
                        r = x * y;
                        stack.push(r);
                        break;

                    case '/':
                        r = x / y;
                        stack.push(r);
                        break;

                    default:
                        break;

                }

            } else {
                stack.push(conversion);
            }
        }

        return stack.peek();
    }

    public static boolean isOperation(char value){
        if(value == '+' || value == '-' || value == '*' || value == '/')
            return true;
        else
            return false;
    }
}
