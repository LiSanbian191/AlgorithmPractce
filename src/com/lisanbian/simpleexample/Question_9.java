package com.lisanbian.simpleexample;

import javax.management.ObjectName;
import java.util.PrimitiveIterator;
import java.util.Stack;

/**
 * 两个栈实现队列
 */
public class Question_9 {
    private Stack<Object> s1 = new Stack<>();
    private Stack<Object> s2 = new Stack<>();

    public void offer(Object o){
        s1.push(o);
    }

    public Object poll(){
        if(s1.isEmpty()&&s2.isEmpty()){
            return null;
            }else {
            if(!s2.isEmpty())
                return s2.pop();
            else {
                while (s1.size()>0){
                    s2.push(s1.pop());
                }
                return s2.pop();
            }
        }
    }
    public boolean isEmpty(){
        return s1.isEmpty()&&s2.isEmpty();
    }

}
