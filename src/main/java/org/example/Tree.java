package org.example;

import java.util.Iterator;

public interface Tree<E> extends Iterable<E> {
    Position<E> root();

    Position<E> parent(Position<E> position);

    Iterable<Position<E>> children(Position<E> position);

    int numChildren(Position<E> position);

    boolean isInternal(Position<E> position);

    boolean isExternal(Position<E> position);

    boolean isRoot(Position<E> position);

    int size();

    boolean isEmpty();

    Iterator<E> iterator();

    Iterable<Position<E>> positions();
}
