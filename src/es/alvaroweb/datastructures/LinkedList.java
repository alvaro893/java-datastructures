package es.alvaroweb.datastructures;

/**
 * Created by Alvaro on 31/07/2016.
 */
public class LinkedList<T> extends AbstractList<T> {
    Node<T> firstNode;
    Node<T> lastNode;

    public LinkedList() {
        super.list = this;
        firstNode = null;
        lastNode = firstNode;
        size = 0;
    }

    public LinkedList(T data){
        firstNode = new Node<T>();
        firstNode.data = data;
        lastNode = firstNode;
        size = 1;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new LinkedListIterator<>();
    }

    @Override
    public void add(T data) {
        Node<T> node = newNode(data);
        if(firstNode == null){
            firstNode = node;
            lastNode = firstNode;
        }else{
            lastNode.nextNode = node;
            lastNode = node;
        }
        size++;
    }

    @Override
    public T get(int index){
        if(!isInBounds(index)) throw new IndexOutOfBoundsException();
        Node<T> node = firstNode;
        for(int i = 0; i < index; i++){
            node = node.nextNode;
        }
        return node.data;
    }

    private boolean isInBounds(int index) {
       return index < size;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    private Node<T> newNode(T data){
        Node node = new Node<T>();
        node.data = data;
        node.nextNode = null;
        return node;
    }

    private class Node<T>{
        T data;
        Node<T> nextNode;
    }

     private class LinkedListIterator<T> implements java.util.Iterator<T> {
        Node<T> node = (Node<T>) firstNode;

        @Override
        public boolean hasNext() {
            return node.nextNode != null;
        }

        @Override
        public T next() {
            T data = node.data;
            node = node.nextNode;
            return data;
        }
    }


}
