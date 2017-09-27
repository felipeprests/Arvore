package btree;

public class BTreeNode<E> implements Comparable<E>{

    private E value;

    private BTreeNode<E> parent;

    private BTreeNode<E> leftChild;

    private BTreeNode<E> rightChild;

    BTreeNode(E e) {
        value = e;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public BTreeNode<E> getLeftChild() {

        return leftChild;
    }

    public void setLeftChild(BTreeNode<E> leftChild) {
        this.leftChild = leftChild;
    }

    public BTreeNode<E> getRightChild() {

        return rightChild;
    }

    public void setRightChild(BTreeNode<E> rightChild) {
        this.rightChild = rightChild;
    }

    public BTreeNode<E> getParent() {

        return parent;
    }

    public void setParent(BTreeNode<E> parent) {
        this.parent = parent;
    }

    public BTreeNode<E> addLeftChild(E e) {
        BTreeNode<E> child = new BTreeNode<>(e);
        child.setParent(this);
        this.setLeftChild(child);
        return child;
    }

    public BTreeNode<E> addLRightChild(E e) {
        BTreeNode<E> child = new BTreeNode<>(e);
        child.setParent(this);
        this.setRightChild(child);
        return child;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int compareTo(E o) {
        Integer newNode = (Integer)o;
        Integer oldNode = (Integer)value;
        return oldNode.compareTo(newNode);
    }
}
