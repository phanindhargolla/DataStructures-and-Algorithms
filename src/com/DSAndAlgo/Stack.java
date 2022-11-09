package com.DSAndAlgo;

public class Stack {
    private ListNode top;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
        this.length++;
    }

    public int pop(){
        if(top == null){
            return -1;
        }
        ListNode temp = top;
        top = top.next;
        temp.next = null;
        this.length--;
        return temp.data;
    }

    public int peek(){
        return top.data;
    }

    public int length(){
        return this.length;
    }

    public void print(){
        ListNode current = top;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
}
