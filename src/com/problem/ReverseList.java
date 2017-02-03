package com.problem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by peng on 2017/1/28.
 */
public class ReverseList {
   public static void reverseList(ListNode headnode){
       Stack<ListNode> stack = new Stack<ListNode>();

       while(headnode != null){
           stack.push(headnode);
           headnode = headnode.getNextNode();
       }

       while(!stack.isEmpty()){
           System.out.println(stack.pop());
       }
   }

}
