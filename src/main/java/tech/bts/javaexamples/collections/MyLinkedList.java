package tech.bts.javaexamples.collections;

/**
 * Simple generic linked list, similar to the original LinkedList.
 */
public class MyLinkedList<T> implements MyList<T> {

    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private int count;

    public MyLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.count = 0;
    }

    @Override
    public void add(T x) {

        ListNode<T> newNode = new ListNode<T>(x, null);

        if (isEmpty()) {

            // Make the newNode the first and the last
            this.firstNode = newNode;
            this.lastNode = newNode;

        } else {

            // Link the lastNode to this newNode
            this.lastNode.setNext(newNode);

            // And make the newNode the current lastNode
            this.lastNode = newNode;
        }

        this.count++;
    }

    public boolean isEmpty() {
        return this.lastNode == null;
    }

    @Override
    public T get(int index) {

        ListNode<T> currentNode = this.firstNode;

        for (int i = 1; i <= index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode.getValue();
    }

    @Override
    public int size() {
        return this.count;
    }
}
