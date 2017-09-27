package main;

import java.util.LinkedList;
import java.util.List;

public class TreeNode<E> {
    private boolean root;
    private E value;
    private TreeNode parent;
    private List<TreeNode<E>> children;

    public TreeNode(E value){
        this.value = value;
        children = new LinkedList<>();
    }

    public TreeNode<E> addChild(E e){
        TreeNode<E> child = new TreeNode<>(e);
        child.setParent(this);
        children.add(child);
        return child;
    }

    public boolean isRoot() {
        return (parent == null);
    }

    public void setRoot(boolean root) {
        this.root = root;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public List<TreeNode<E>> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode<E>> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public String makeWord(){
        if(isRoot()){
            return value.toString();
        }else{
            return getParent().makeWord() + getValue().toString();
        }
    }
}
