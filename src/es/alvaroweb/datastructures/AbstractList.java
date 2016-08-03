package es.alvaroweb.datastructures;

import java.util.*;

/**
 * Created by Alvaro on 31/07/2016.
 */
public abstract class AbstractList<T> extends AbstractCollection<T> implements List<T>, Iterable<T>{
    List<T> list;
    protected int size;

    @Override
    public T get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void update(int index, T data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        list = null;
    }

    @Override
    public String toString() {
        Iterator<T> iterator = iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("* ");
        while (iterator.hasNext()){
            sb.append(" -> " + iterator.next());
        }
        return sb.toString();
    }
}
