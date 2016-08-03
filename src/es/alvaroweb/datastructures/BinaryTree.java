package es.alvaroweb.datastructures;

import java.util.Iterator;

/**
 * Created by Alvaro on 31/07/2016.
 */
public class BinaryTree<T> extends AbstractCollection<T> {
    T data;
    BinaryTree<T> nodeRight;
    BinaryTree<T> nodeLeft;

    public BinaryTree(T data) {
        this.data = data;
        nodeRight = null;
        nodeLeft = null;
    }

    @Override
    public void add(T data) {
        if(nodeRight == null){
            nodeRight = new BinaryTree<>(data);
        } else if (nodeLeft == null){
            nodeLeft = new BinaryTree<>(data);
        }else{
            //TODO: add
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        traverse(this, t -> sb.append(" " + t.toString()) );
        return sb.toString();
    }

    private void traverse(BinaryTree<T> node, Callback callback){
        if(node.data == null) return;
        if(node.nodeLeft != null) traverse(node.nodeLeft, callback);
        if(node.nodeRight != null) traverse(node.nodeRight, callback);
        callback.operation(node.data);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
    
    private interface Callback{
        void operation(Object t);
    }
}
