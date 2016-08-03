package es.alvaroweb.datastructures;

/**
 * Created by Alvaro on 01/08/2016.
 */
public interface Collection<T> extends Iterable<T> {
    void add(T data);
    int size();
    void clear();
    boolean isEmpty();
}
