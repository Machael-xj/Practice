package com.problem7;

import java.util.Stack;

/**
 * Created by peng on 2017/1/30.
 */
public class MyQueue {

    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    public void appendTail(int number){
           stack1.push(number);
    }

    public int deleteHead() throws Exception {
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                throw new Exception("No item in the queue");
            }else{
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
        }

        return stack2.pop();
    }
}
