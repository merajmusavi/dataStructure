package org.example;

public abstract class AbstractTree<E> implements Tree<E> {
    public boolean isInternal(Position<E> position) {
        return numChildren(position) > 0;
    }

    public boolean isExternal(Position<E> position) {
        return numChildren(position) == 0;

    }

    public boolean isRoot(Position<E> position) {
        return position == root();

    }

    public boolean isEmpty() {
        return size() == 0;
    }
    public int depth(Position<E> position){
        if (isRoot(position)){
            return 0;
        }else {
            return 1 + depth(parent(position));
        }
    }
}
