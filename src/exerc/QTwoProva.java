package exerc;

import btree.BTree;
import btree.BTreeNode;

import java.util.*;

public class QTwoProva {

    public static void main(String[] args){
        BTree<Integer> root = new BTree<>(3);
        BTreeNode<Integer> node15 = root.getRoot().addLRightChild(15);
        BTreeNode<Integer> node12 = root.getRoot().addLeftChild(12);
        node12.addLRightChild(8);
        node12.addLeftChild(3);
        node15.addLRightChild(17);

        System.out.println("Os três menores são: " + retornaOsMenores(root));
    }

    public static Integer[] retornaOsMenores(BTree<Integer> root){
        List<Integer> myList= new ArrayList<>();

        Queue<BTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root.getRoot());
        while (!queue.isEmpty()){
            BTreeNode<Integer> temp = queue.poll();
            myList.add(temp.getValue());
            System.out.println(temp);
            if(temp.getLeftChild() != null){
                queue.add(temp.getLeftChild());
            }
            if(temp.getRightChild() != null){
                queue.add(temp.getRightChild());
            }
        }

        Collections.sort(myList);
        myList = myList.size() > 3 ? myList.subList(0,3) : myList;
        return  myList.toArray(new Integer[myList.size()]);
//        Integer[] myIntegers = myList.toArray(new Integer[myList.size()]);
//        Arrays.sort(myIntegers);
//        Integer[] newIntegers = new Integer[3];
//
//        for (int i = 0; i < 3; i++){
//            if(i == 3)
//                break;
//            newIntegers[i] = myIntegers[i];
//        }
        //return null;//newIntegers;
    }
}
