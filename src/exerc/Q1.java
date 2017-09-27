package exerc;

import btree.BTreeNode;
import main.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1 {

    public static void main(String[] args){
        TreeNode<Character> root = new TreeNode<>('a');
        TreeNode<Character> b = root.addChild('b');
        TreeNode<Character> c = root.addChild('c');
        TreeNode<Character> d = c.addChild('d');
        TreeNode<Character> e = c.addChild('e');
        TreeNode<Character> f = c.addChild('f');

        remove(root, c);
        bfs(root);
    }

    public static void remove(TreeNode<Character> root, TreeNode<Character> node){

        if(node.isRoot()){
            return;
        }

        if(node.getChildren().isEmpty()){
            node.getParent().getChildren().remove(node);
        }else{
            TreeNode<Character> firstChild = node.getChildren().get(0);

            for (int i = 1; i < node.getChildren().size(); i++){
                node.getChildren().get(i).setParent(firstChild);
                firstChild.getChildren().add(node.getChildren().get(i));
            }

            firstChild.setParent((node.getParent()));
            node.getParent().getChildren().add(firstChild);
            node.getParent().getChildren().remove(node);


        }
    }

    public  static void bfs(TreeNode<Character> node){
        Queue<TreeNode<Character>> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            TreeNode<Character> processing = queue.poll();
            System.out.println(processing);
            for (TreeNode<Character> treeNode : processing.getChildren()) {
                queue.add(treeNode);
            }
        }
    }
}
