package com.company;

import java.util.Iterator;

public interface MyList<T> extends Iterable<T> {
    void addElement(T data);
    void addElement(int index, T data);
    T getElement(int index);
    void removeElement(int index);
    int getSize();
    void clear();

    @Override
    Iterator<T> iterator();
}