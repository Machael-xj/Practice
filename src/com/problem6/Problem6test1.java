package com.problem6;


/**
 * Created by liujia on 14-8-26.
 */
public class Problem6test1 {
	public  static void main(String args[]) throws Exception
	{
		ConstructCore1 test=new ConstructCore1();
		int[] pre={1,2,3,4};
		int[] in={5,6,7,1};
		BinaryTreeNode root=test.constructCore(pre,in);
		BTreeTraverse.traverse(root);
	}
}
