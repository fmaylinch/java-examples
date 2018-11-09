package tech.bts.javaexamples.collections;

// TODO: This list can only store Double values, but we will fix this later
public interface MyList {

    /** Adds an value to the end of the list */
    void add(Double x);

    /** Returns the value at the specified index */
    Double get(int index);

    /** Returns the number of values currently in the list */
    int size();
}
