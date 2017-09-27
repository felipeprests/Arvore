package exerc;

import main.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class QOneProva {

    public static void main(String[] args){

        TreeNode<Integer> root  = new TreeNode<>(6);
        root.addChild(8);
        root.addChild(9);
        TreeNode<Integer> node4 = root.addChild(4);
        node4.addChild(3);
        node4.addChild(1);

        System.out.println("O menor é :" + retornaOMenor(root));
    }

    public static int retornaOMenor(TreeNode<Integer> root){

        int menor  = root.getValue();
        int maior = root.getValue();

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode<Integer> processing = queue.poll();
            if(processing.getValue() < menor){
                menor = processing.getValue();
            }
            if(processing.getValue() > maior){
                maior = processing.getValue();
            }
            System.out.println(processing);
            for (TreeNode<Integer> treeNode : processing.getChildren()) {
                queue.add(treeNode);
            }
        }
        return menor;
    }
}
