package com.company;

public class MyLinkdedListQueue {
    private Node head;
    private Node tail;

    public MyLinkdedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if ( this.head == null)
            this.tail = null;
        return temp;
    }


}
