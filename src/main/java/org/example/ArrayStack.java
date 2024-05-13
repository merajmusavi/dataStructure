package org.example;

public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY = 1000;
    private E[] data;

    private int t = -1;

    public ArrayStack() {
        data = (E[]) new Object[CAPACITY];
    }

    @Override
    public int size() {
        return t + 1;
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return data[t];
    }

    @Override
    public void push(E element) {
        if (size() == data.length) {
            throw new IllegalStateException("stack is full");
        }
        data[++t] = element;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
}
