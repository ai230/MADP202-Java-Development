/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist_stack;

/**
 *
 * @author yamamotoai
 */
public class StackMain {
    public static void main(String[] args) {
        
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.print();

        stack.pop();
        stack.pop();
        stack.print();

        if(stack.isFull()){
            System.out.println("Stack is full");
        }else if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        System.out.println("Stack size is " + stack.size());
        
        
    }
}
