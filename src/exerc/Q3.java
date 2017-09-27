package exerc;

import main.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q3 {

    public static void main(String[] args){
        TreeNode<Character> root = new TreeNode<>('a');
        TreeNode<Character> b = root.addChild('b');
        TreeNode<Character> c = root.addChild('c');
        TreeNode<Character> d = c.addChild('d');
        TreeNode<Character> e = c.addChild('e');
        TreeNode<Character> f = c.addChild('f');


        bfs(root);
    }

    public List<String> findWords(TreeNode<Character> node){
    List<String>  list = new ArrayList<>();

    Queue<TreeNode<Character>> queue = new LinkedList<>();
    queue.add(node);
    while(!queue.isEmpty()){
        TreeNode<Character> processing = queue.poll();
        list.add(processing.makeWord());
        for (TreeNode<Character> treeNode : processing.getChildren()) {
            queue.add(treeNode);
        }
    }
        return list;
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
