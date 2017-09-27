package main;

import btree.BTree;
import btree.BTreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args){
        TreeNode<String> root = new TreeNode<>("Raiz");
//        root.addChild("F1");
//        TreeNode<String> f2 = root.addChild("F2");
//        f2.addChild("F3");
//        f2.addChild("F4");
//
//        List<TreeNode<String>> children = root.getChildren();
//
//        for (TreeNode<String> treeNode : root.getChildren()) {
//            System.out.println(treeNode);
//        }
//        System.out.println(root);

//        root.addChild("B");
//        TreeNode<String> c = root.addChild("C");
//        c.addChild("D");
//        c.addChild("E");
//        TreeNode<String > f = c.addChild("F");
//        f.addChild("G");
//
//        bfs(root);


//        BTree<Integer> btree = new BTree<>(6);
//        BTreeNode<Integer> four = btree.getRoot().addLeftChild(4);
//        BTreeNode<Integer> seven = btree.getRoot().addLRightChild(7);
//
//        four.addLeftChild(3);
//        four.addLRightChild(5);
//        seven.addLRightChild(9);
//
//        traverseDFS(btree.getRoot());
//        System.out.println(btree);

        BTree<Integer> btre = new BTree<>(6);
        btre.insert(5);

        traverseBFS(btre.getRoot());
    }

    public static boolean search(TreeNode<String> node, String s){
        Queue<TreeNode<String>> queue  = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            TreeNode<String> processing = queue.poll();
            if(processing.getValue().equals(s)){
                return true;
            }
            for (TreeNode<String> treeNode: processing.getChildren()) {
                queue.add(treeNode);
            }
        }
        return  false;
    }

    public static void traverseBFS(BTreeNode<Integer> node){
        Queue<BTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            BTreeNode<Integer> temp = queue.poll();
            System.out.println(temp);
            if(temp.getLeftChild() != null){
                queue.add(temp.getLeftChild());
            }
            if(temp.getRightChild() != null){
                queue.add(temp.getRightChild());
            }
        }
    }

    public static int searchLevel(TreeNode<String> node, String s){

        return  -1;
    }

    public  static void bfs(TreeNode<String> node){
        Queue<TreeNode<String>> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            TreeNode<String> processing = queue.poll();
            System.out.println(processing);
            for (TreeNode<String> treeNode : processing.getChildren()) {
                queue.add(treeNode);
            }
        }
    }

    public static void dfs(TreeNode<String> node){
        System.out.println(node);
        List<TreeNode<String>> children = node.getChildren();

        for (TreeNode<String> treeNode : children) {
            System.out.println(treeNode);
        }
    }

    public static void traverseDFS(BTreeNode<Integer> node){

        System.out.println(node);
        if(node.getLeftChild() != null){
            traverseDFS(node.getLeftChild());
        }

        if(node.getRightChild() != null){
            traverseDFS(node.getRightChild());
        }
    }
}
