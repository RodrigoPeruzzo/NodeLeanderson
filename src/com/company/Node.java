package com.company;

public class Node<T>{
    private T value;
    private com.company.Node next;
    private com.company.Node previous;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public com.company.Node getNext() {
        return next;
    }

    public void setNext(com.company.Node next) {
        this.next = next;
    }

    public com.company.Node getPrevious() {
        return previous;
    }

    public void setPrevious(com.company.Node previous) {
        this.previous = previous;
    }
}
