package com.company;


import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);
        System.out.println(queue);
        var front = queue.remove();
        System.out.println(front);
        System.out.println(queue);

        //PriorityQueue
        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        queue2.add(5);
        queue2.add(1);
        queue2.add(3);
        queue2.add(2);
        while (!queue2.isEmpty())
            System.out.println(queue2.remove());




    }
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
