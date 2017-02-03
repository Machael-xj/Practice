package com.problem7;

/**
 * Created by peng on 2017/1/30.
 */
public class Problem7Test {
    public static void main(String[] args)throws Exception {
        MyQueue queue = new MyQueue();
        queue.appendTail(1);
        queue.appendTail(2);
        System.out.println(queue.deleteHead());
    }
}
