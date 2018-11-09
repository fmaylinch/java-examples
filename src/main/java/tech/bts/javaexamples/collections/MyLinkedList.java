package tech.bts.javaexamples.collections;

public class MyLinkedList implements MyList {

    private ListNode firstNode;
    private ListNode lastNode;
    private int count;

    public MyLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.count = 0;
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

        this.count++;
    }

    public boolean isEmpty() {
        return this.lastNode == null;
    }

    @Override
    public Double get(int index) {

        ListNode currentNode = this.firstNode;

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
