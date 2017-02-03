package com.problem6;

/**
 * Created by peng on 2017/1/30.
 */
public class BTreeTraverse {
    public static void traverse(BinaryTreeNode node){
        if(node == null){
            return;
        }
        traverse(node.LeftChild);
        System.out.print(node.value);
        traverse(node.RightChild);
    }
}
