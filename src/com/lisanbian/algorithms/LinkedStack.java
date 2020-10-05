package com.lisanbian.algorithms;

public class LinkedStack<E> {
    //定义节点类型
    private class Node{
        E item;
        Node next;
    }

    private Node first;//栈顶节点
    private int count;//栈中元素数量

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return count;
    }

    public void push(E item){
        Node node = new Node();
        node.item = item;
        node.next = first;
        first = node;
        count++;
    }

    public Node pop(){
        if(isEmpty())
            return null;
        else {
            Node node = first;
            first = first.next;
            count--;
            return node;
        }

    }

    public Node peek(){
        return first;
    }

}
