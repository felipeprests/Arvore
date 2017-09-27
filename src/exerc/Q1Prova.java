package exerc;
import main.TreeNode;
import sun.reflect.generics.tree.Tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1Prova {

    public static void main(String[] args){
        TreeNode<Integer> root = new TreeNode<>(6);

        root.addChild(8);
        root.addChild(9);
        TreeNode<Integer> node4 = root.addChild(4);
        node4.addChild(1);
        node4.addChild(3);

        System.out.println("O menor é: " + metodoQualquer(root));
    }



    public static int metodoQualquer(TreeNode<Integer> root){

        int menor = root.getValue();

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode<Integer> processing = queue.poll();

            if(processing.getValue() < menor){
                menor = processing.getValue();
            }

            System.out.println(processing);
            queue.addAll(processing.getChildren());
        }

        return menor;
    }







    public int retornaMenorMelhorMetodo(TreeNode<Integer> node){

        int menor = 0;
        int atual = node.getValue();

        if(atual < menor)
            menor = atual;

        return menor;
    }

//    public int retornaMenor(Integer[] elements){
//
//
//
//        int count = 0
//        int menor = 0;
//        for (int i = 1; i < elements.length; i++){
//            int current = elements[i];
//            int getPrevious = 0;
//            TreeNode<Integer> node = null;
//
//            if(i >= 2){
//                getPrevious = elements[i - 1];
//            }
//
//            if(current < menor){
//                menor = current;
//            }
//
//            if(getPrevious != 0){
//               if(elements[i] == 4){
//                    node = new TreeNode<Integer>(elements[i]);
//                    parent = new TreeNode<Integer>(node.getValue());
////                    tree.addChild(node.getValue());
////                    listValues.add(elements[i]);
//                }
//                if(current < 4){
//
//
//                       node = new TreeNode<Integer>(elements[i]);
//
//
//                    tree.addChild(parent.getValue());
//                    listValues.add(elements[i]);
//                }
//            }
//
//            if(!listValues.contains(elements[i])){
//                if(elements[i] != 4){
//                    tree.addChild(elements[i]);
//                    listValues.add(elements[i]);
//                }
//            }
//
//
//        }
//
//        return menor;
//    }
}
