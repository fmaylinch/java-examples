package tech.bts.javaexamples.collections;

public class MyLinkedList implements MyList {

    private ListNode firstNode;
    private ListNode lastNode;

    public MyLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
    }

    @Override
    public void add(Double x) {

        ListNode newNode = new ListNode(x, null);

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
    }

    public boolean isEmpty() {
        return this.lastNode == null;
    }

    @Override
    public Double get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
