package exerc;

import main.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Q1ProvaLoca {

    public static void main(String[] args){
        TreeNode<Integer> root  = new TreeNode<>(6);
        root.addChild(8);
        root.addChild(9);
        TreeNode<Integer> node4 = root.addChild(4);
        node4.addChild(3);
        node4.addChild(1);

        Queue<TreeNode<Integer>> numeros = retornaSemFilho(root);
        for (int i = 0; i <retornaSemFilho(root).size(); i++ ){
            System.out.println("Sem filhos: " + numeros.poll());
        }

    }

    public static Queue<TreeNode<Integer>> retornaSemFilho(TreeNode<Integer> root){

        Queue<TreeNode<Integer>> myQueue = new LinkedList<>();

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode<Integer> processing = queue.poll();
            //System.out.println(processing);
            if(processing.getChildren().size() == 0){
                queue.add(processing);
                myQueue.add(processing);
                if(queue.size() == myQueue.size()){
                    myQueue = queue;
                    break;
                }
            }else{
                queue.addAll(processing.getChildren());
            }
        }

        return myQueue;
    }
}
