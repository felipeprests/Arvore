package exerc;

import btree.BTree;
import org.junit.Assert;
import org.junit.Test;

public class Q2Test {

    @Test
    public void testInsertElements(){

        Q2 q = new Q2();
        Integer[] elements = {15,27,3,14,51,16,17,82,90,100};
        BTree<Integer> treeExpec = new BTree<>(15);
        treeExpec.insert(27);
        treeExpec.insert(3);
        treeExpec.insert(14);
        treeExpec.insert(51);
        treeExpec.insert(16);
        treeExpec.insert(17);
        treeExpec.insert(82);
        treeExpec.insert(90);
        treeExpec.insert(100);
        BTree<Integer> treeResult = q.inserirElementos(elements);
        Assert.assertTrue(treeExpec.getRoot().getValue() == treeResult.getRoot().getValue());

    }
}
