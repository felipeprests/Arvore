package exerc;

import btree.BTree;
import btree.BTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q2ProvaLoca {

    public static void main(String[] args){
        BTree<Integer> root = new BTree<>(12);
        BTreeNode<Integer> node15 = root.getRoot().addLRightChild(15);
        BTreeNode<Integer> node9 = root.getRoot().addLeftChild(9);
        node9.addLRightChild(10);
        node9.addLeftChild(8);
        node15.addLRightChild(17);
        int N = 10; //Pode ser alterado o valor nesta variável
        List<Integer> numerosMenores= retornaOsMenores(root, N);
        System.out.println("Os três menores que "+ N +" são: ");
        for (Integer item: numerosMenores) {
            System.out.println(item);
        }


    }

    public static List<Integer> retornaOsMenores(BTree<Integer> root, int n){
        List<Integer> myList = new ArrayList<>();

        Queue<BTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root.getRoot());
        while (!queue.isEmpty()){
            BTreeNode<Integer> temp = queue.poll();

            if(temp.getValue() < n){
                myList.add(temp.getValue());
            }
            System.out.println(temp);
            if(temp.getLeftChild() != null){
                queue.add(temp.getLeftChild());
            }
            if(temp.getRightChild() != null){
                queue.add(temp.getRightChild());
            }
        }
        return myList;
    }
}
