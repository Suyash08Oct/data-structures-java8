package com.stack;

public class Stack {
    int size;
    int top;
    char [] array;

    public Stack(int size){
        this.size = size;
        top = -1;
        this.array = new char[size];
    }

    /**
     * @param data
     * @return
     * Pushes the element into stack and return true, if inserted.
     * Time Complexity O(1)
     */
    public boolean push(char data){
        if(top == size - 1){
            System.out.println("Stack is Full");
            return false;
        } else {
            top++;
            array[top] = data;
            return true;
        }
    }

    /**
     * @return
     * Pops the top element from the stack
     * Time Complexity O(1)
     */
    public char pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return '\0';
        } else {
            char temp = array[top];
            top--;
            return temp;
        }
    }

    /**
     * @return top of the stack
     * Time Complexity O(1)
     */
    public char peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return '\0';
        } else {
            return array[top];
        }
    }

    /**
     * @param position
     * @return the element in the specified position from the top
     * Time Complexity O(1)
     */
    public char peek(int position){
        int formula = top - position + 1;
        if(top == -1 || formula < 0){
            System.out.println("Stack is Empty or Position is incorrect");
            return '\0';
        } else {
           return array[formula];
        }
    }

    /**
     * Traverses the stack
     * Time Complexity O(n)
     */
    public void traverse(){
        int temp = top;
        while(temp != -1){
            System.out.print(array[temp] + " ");
            temp--;
        }
    }

    public boolean isEmpty(){
        if (top == -1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if(top == size - 1)
            return true;
        else
            return false;
    }

}
