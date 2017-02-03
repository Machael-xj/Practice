package com.problem6;

/**
 * Created by peng on 2017/1/30.
 */
public class Problem6Test {
    public static void main(String[] args) throws Exception {
        int[] preorder = {1,2,4,7,3,5,6,8};
        int[] inorder = {4,7,2,1,5,3,8,6};

        BinaryTreeNode root = ConstructCore.construct(preorder,inorder);
        BTreeTraverse.traverse(root);
    }
}
