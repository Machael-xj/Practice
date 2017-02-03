package com.problem6;

import java.util.Arrays;

/**
 * Created by peng on 2017/1/30.
 */
public class ConstructCore {
    public static BinaryTreeNode construct(int[] preorder,int[] inorder) throws Exception {
        if(preorder == null || inorder == null){
            throw new Exception("Input must be not null");
        }

        if(preorder.length != inorder.length){
            throw new Exception("The length is not same");
        }

        Boolean isfind = false;

        BinaryTreeNode root = new BinaryTreeNode();
        for(int i = 0; i<inorder.length;i++){
            if(inorder[i] == preorder[0]){
                isfind = true;
                root.value = inorder[i];
                root.LeftChild = construct(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
                root.RightChild = construct(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));

            }
        }

        if(isfind = false){
            throw new Exception("Root is not find");
        }

        return root;
    }
}
