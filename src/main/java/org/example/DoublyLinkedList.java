package org.example;

public class DoublyLinkedList<E> {
    private Node<E> header;
    private Node<E> trailer;
    public int size = 0;

    public DoublyLinkedList(){
        header = new Node<>(null,null,null);
        trailer = new Node<>(null,header,null);
        header.setNext(trailer);
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size ==0;
    }

    public E first(){
        if (isEmpty()){
            return null;
        }
        return header.getNext().getElement();
    }

    public E last(){
        if (isEmpty()){
            return null;
        }
        return trailer.getPrev().getElement();
    }
    private static class Node<E>{
       private E element;
       private Node<E> next;
       private Node<E> prev;

       public Node(E e,Node<E> prev,Node<E> next){
           this.element = e;
           this.next = next;
           this.prev = prev;
       }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }

}
