package org.example;

import java.util.ArrayList;
import java.util.List;

public class Position <E>{
    private E element;
    private Position<E> parent;
    private List<Position<E>> children;

    public Position(E element, Position<E> parent) {
        this.element = element;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Position<E> getParent() {
        return parent;
    }

    public List<Position<E>> getChildren() {
        return children;
    }

    public void addChild(Position<E> child) {
        children.add(child);
    }
}
