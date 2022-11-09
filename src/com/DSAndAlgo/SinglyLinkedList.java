package com.DSAndAlgo;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public ListNode createLinkedList(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(1);
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);
        singlyLinkedList.head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        return singlyLinkedList.head;
    }

    public void print(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print( current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int count(ListNode head){
        ListNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public ListNode insertAtBegin(ListNode head,int data){
        ListNode newNode = new ListNode(8);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public ListNode insertAtEnd(ListNode head,int data){
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        if(head == null){
            head = newNode;
        }else{
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public ListNode insertAtPos(ListNode head,int data,int pos){
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        int count = 1;
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }else{
            while(count < pos - 1){
                current = current.next;
                count++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        return head;
    }

    public ListNode deleteAtFirst(ListNode head){
        if(head == null || head.next == null){
            return head;
        }else{
            head = head.next;
        }
        return head;
    }

    public ListNode deleteAtEnd(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        if(head == null || head.next == null){
            return head;
        }else{
            while(current.next != null){
                prev = current;
                current = current.next;
            }
            prev.next = null;
        }
        return head;
    }

    public ListNode deleteAtPos(ListNode head,int pos){
        int count = 1;
        ListNode current = head;
        if(pos == 1){
            head = head.next;
        }else{
            while(count < pos - 1){
                current = current.next;
                count++;
            }
            current.next = current.next.next;
        }
        return head;
    }

    public boolean searchElement(ListNode head,int data){
        ListNode current = head;
        while (current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public int middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public int LastNthNode(ListNode head,int pos){
        ListNode ref = head;
        ListNode current = head;
        int count = 0;
        while(count < pos){
            ref = ref.next;
            count++;
        }
        while(ref != null){
            current = current.next;
            ref = ref.next;
        }
        return current.data;
    }

    public ListNode removeDuplicateSorted(ListNode head){
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }

    public ListNode insertSorted(ListNode head,int data){
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        ListNode prev = null;
        while(current != null && current.data < data){
            prev = current;
            current = current.next;
        }
        newNode.next = current;
        prev.next = newNode;
        return head;
    }

    public ListNode removeKey(ListNode head,int data){
        ListNode current = head;
        ListNode prev = null;
        if(current.data == data){
            head = head.next;
        }else{
            while(current != null && current.data != data){
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
        }
        return head;
    }

}
