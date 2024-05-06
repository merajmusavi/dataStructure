package org.example;

public class SinglyLinkedList<E> {

    // reference to the first Member of SinglyLinkedList
    private Node<E> head = null;
    // reference to the last member of SinglyLinkedList
    private Node<E> tail = null;

    private int size = 0;

    public SinglyLinkedList() {
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    private static class Node<E> {

        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            this.element = e;
            this.next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
