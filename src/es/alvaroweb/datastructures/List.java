package es.alvaroweb.datastructures;

/**
 * Created by Alvaro on 31/07/2016.
 */
public interface List<T> extends Collection<T> {
    T get(int index);
    void delete(int index);
    void update(int index, T data);
}
