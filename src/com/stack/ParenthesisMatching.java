package com.stack;

/**
 * Program to evaluate, if parenthesis expression is correct.
 */
public class ParenthesisMatching {
    public static void main(String[] args) {
        String expression = "{([a+b) * [c+d]] / e)}";

        Stack stack = new Stack(expression.length());
        boolean isWrong = false;

        for(char c : expression.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if(c == ')' || c == '}' || c == ']'){
                if(!stack.isEmpty()){

                    char popped = stack.pop();
                    if(!isFamily(popped, c)){
                        isWrong = true;
                        break;
                    }

                } else {
                    isWrong = true;
                    break;
                }
            }
        }

        if(stack.isEmpty() && !isWrong){
            System.out.println("Correct Parenthesis Expression");
        } else {
            System.out.println("Wrong Expression");
        }
    }

    public static boolean isFamily(char a, char b){
        if(a == '(' && b == ')')
            return true;
        else if(a == '[' && b == ']')
            return true;
        else if(a == '{' && b == '}')
            return true;
        else
            return false;
    }
}
