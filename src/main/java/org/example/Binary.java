package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Binary<E> extends AbstractTree<E> implements BinaryTree<E> {

    public Position<E> sibling(Position<E> p) {
        Position<E> parent = parent(p);
        if (parent == null) return null;
        if (p == left(parent)) {
            return right(parent);
        } else
            return left(parent);
    }

    public int numChildren(Position<E> p) {
        int count = 0;
        if (left(p) != null) {
            count++;
        }
        if (right(p) != null) {
            count++;
        }
        return count;
    }

    public Iterable<Position<E>> children(Position<E> position) {
        List<Position<E>> snapShot = new ArrayList<>();
        if (left(position) != null) {
            snapShot.add(left(position));
        }
        if (right(position) != null) {
            snapShot.add(position);
        }
        return snapShot;

    }
}
