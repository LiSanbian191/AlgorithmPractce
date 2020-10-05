package com.lisanbian.algorithms;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ResizingArrayStack<E> implements Iterable<E> {

    private E[] stack  = (E[]) new Object[16];//使用数组实现栈,默认初始容量为16
    private int top=-1;//栈顶指针

    public boolean isEmpty(){
        return top==-1;
    }

    public void push(E e){
        stack[++top] = e;
        if(top==stack.length-1)
            resize(stack.length*2);

    }

    public E pop(){
        E item = null;
        if(!isEmpty()){
            item= stack[top];
            stack[top--]=null;//将其置为null,防止游离，便于回收
            if(top+1==stack.length/4)
                resize(stack.length/2);
        }
        return item;
    }

    public void resize(int max){
            E[] temp  = (E[]) new Object[max];
            for(int i = 0;i<top+1;i++){
                temp[i] = stack[i];
        }
            stack = temp;
    }

    public E getTop(){
        return top==-1?null:stack[top];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }
}
