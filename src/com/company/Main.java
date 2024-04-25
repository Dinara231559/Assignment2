package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Double> myLinkedList = new MyLinkedList<>();

        myLinkedList.addElement(1.0);
        myLinkedList.addElement(2.5);
        myLinkedList.addElement(2.8);
        myLinkedList.addElement(4.7);
        myLinkedList.addElement(5.0);

        System.out.println("Element at index 3: " + myLinkedList.getElement(3));
        myLinkedList.removeElement(3);
        System.out.println("Element at index 3 after removal: " + myLinkedList.getElement(3));
    }
}
