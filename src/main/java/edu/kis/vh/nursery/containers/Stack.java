package edu.kis.vh.nursery.containers;

public interface Stack {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
