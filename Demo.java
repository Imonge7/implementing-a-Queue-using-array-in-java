package com.company;

public class Demo {
    public static void main(String[] args){
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        var first = queue.dequeue();
        System.out.println(first);
    }
}
