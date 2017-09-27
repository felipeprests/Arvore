package exerc;

import btree.BTree;
import btree.BTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Q2 {

    public BTree<Integer> inserirElementos(Integer[] elements){

        BTree<Integer> tree = new BTree<>(elements[0]);

        for (int i = 1; i < elements.length; i++){
            tree.insert(elements[i]);
        }
        return tree;
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
}
