package com.tek.dsa.tree_node;

import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val=val;
        this.left=this.right=null;
    }
}
public class InOrder {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right.left=new TreeNode(5);
        root.right.right=new TreeNode(7);
        inorder(root);
    }
    public static void inorder(TreeNode root){
        TreeNode current=root;
        Stack<TreeNode> stack=new Stack<>();
        while(current!=null || !stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            System.out.println(current.val);
            current=current.right;
        }
    }
}
