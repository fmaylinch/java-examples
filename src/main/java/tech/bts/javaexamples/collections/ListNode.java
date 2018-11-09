package tech.bts.javaexamples.collections;

// TODO: fix this class so we can use other types, not only Double

/**
 * This will store one value of a list
 */
public class ListNode {

    private Double value;
    private ListNode next;

    public ListNode(Double value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
