package btree;

public class BTree<E> {

    private BTreeNode<E> root;

    public BTree(E e){
        BTreeNode<E> node = new BTreeNode<>(e);
        this.root = node;
    }

    public void insert(E e){
        BTreeNode<E> current = getRoot();
        BTreeNode<E> node = new BTreeNode<>(e);

        while (true){
            if(node.compareTo((E) current.getValue() ) < 0){
                BTreeNode<E> left = current.getLeftChild();
                if(left == null){
                    current.setLeftChild(node);
                    return;
                }else{
                    current = current.getLeftChild();
                }
            }else{
                BTreeNode<E> right = current.getRightChild();
                if(right == null){
                    current.setRightChild(node);
                    return;
                }else{
                    current = current.getRightChild();
                }
            }
        }
    }

    public boolean search(E e){
        BTreeNode<E> current = getRoot();
        while (current != null){
            if(current.compareTo(e) == 0){
                return true;
            }else if(current.compareTo(e) > 0){
                current = current.getLeftChild();
            }else{
                current = current.getRightChild();
            }
        }
        return false;
    }

    public BTreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(BTreeNode<E> root) {
        this.root = root;
    }

    public  BTreeNode<E> addChild(E e){
        return null;
    }
}
