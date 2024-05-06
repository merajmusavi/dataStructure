package org.example;

public class SinglyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e,Node<E> n){
            this.element = e;
            this.next = n;
        }

        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
