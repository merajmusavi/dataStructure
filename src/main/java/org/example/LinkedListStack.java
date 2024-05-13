package org.example;

public class LinkedListStack<E> implements Stack<E> {
    SinglyLinkedList<E> singlyLinkedList = new SinglyLinkedList<>();

    @Override
    public int size() {
        return singlyLinkedList.size();
    }

    @Override
    public boolean isEmpty() {
        return singlyLinkedList.isEmpty();
    }

    @Override
    public E top() {
        return singlyLinkedList.first();
    }

    @Override
    public void push(E element) {
        singlyLinkedList.addFirst(element);
    }

    @Override
    public E pop() {
      return   singlyLinkedList.removeFirst();
    }
}
