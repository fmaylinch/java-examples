package tech.bts.javaexamples.collections;

/** Generic list that can be used with many types */
public interface MyList<T> {

    /** Adds an value to the end of the list */
    void add(T x);

    /** Returns the value at the specified index */
    T get(int index);

    /** Returns the number of values currently in the list */
    int size();
}
