package es.alvaroweb.datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Alvaro on 31/07/2016.
 */
public class ArrayList<T> extends AbstractList<T> {
    private static final int INITIAL_CAPACITY = 10;

    private Object[] list;

    public ArrayList() {
        list = new Object[INITIAL_CAPACITY];
    }


    @Override
    public void add(T data) {

    }

    @Override
    public boolean isEmpty() {
        return this.list.length == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
