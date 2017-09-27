package exerc;

import btree.BTree;
import btree.BTreeNode;

import java.util.*;

public class Q2Prova {

    public static void main(String[] args) {

        BTree<Integer> root = new BTree<>(12);
        BTreeNode<Integer> node15 = root.getRoot().addLRightChild(15);
        BTreeNode<Integer> node9 = root.getRoot().addLeftChild(9);

        node15.addLRightChild(17);

        BTreeNode<Integer> nide8 = node9.addLeftChild(8);
        node9.addLRightChild(10);
        //Integer[] numeros = menor(root);
        //System.out.println("Os três menores são: " + numeros[0] + ", "+ numeros[1] + ", " + numeros[2]);
    }

    public static List<Integer> menor(BTree<Integer> root) {

        List<Integer> list = new ArrayList<>();

        Queue<BTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root.getRoot());

        while (!queue.isEmpty()) {
            BTreeNode<Integer> temp = queue.poll();
            list.add(temp.getValue());
            System.out.println(temp);
            if (temp.getLeftChild() != null) {
                queue.add(temp.getLeftChild());
            }
            if (temp.getRightChild() != null) {
                queue.add(temp.getRightChild());
            }
        }

        Collections.sort(list);

        if(list.size() > 3){
            return list.subList(0,3);
        }
//        Integer[] integers = list.toArray(new Integer[list.size()]);
//        Arrays.sort(integers);
//        Integer[] novoArray = new Integer[3];
//
//        for (int i = 0; i < integers.length; i++) {
//            if (i == 3)
//                break;
//            novoArray[i] = integers[i];
//        }


        return list;
    }

}
