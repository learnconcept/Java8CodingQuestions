package com.examples.dsa.linkedlist;

public class SingleLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.head = new SingleLinkedList.ListNode(10);
        SingleLinkedList.ListNode second = new SingleLinkedList.ListNode(15);
        SingleLinkedList.ListNode third = new SingleLinkedList.ListNode(20);
        SingleLinkedList.ListNode fourth = new SingleLinkedList.ListNode(25);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        printLinkedList(sll.head);
        System.out.println("=============");
        printSizeOfLinkedList(sll.head);
        System.out.println("=============");
        sll.addNewNodeAtStart(5);
        sll.addNewNodeAtStart(3);
        printLinkedList(sll.head);
        System.out.println("=============");
        sll.addNewNodeAtEnd(35);
        printLinkedList(sll.head);
        sll.addNewNodeAtPosition(9,2);
        printLinkedList(sll.head);
    }

    private void addNewNodeAtPosition(int data, int position) {
        ListNode node = new ListNode(data);
        if(position ==1){
            node.next =head;
            head = node;
        }else{
            ListNode previous = head;
            int count =1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
            head = previous;
        }
    }

    private ListNode addNewNodeAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return head;
        }
        ListNode current = head;

        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
        //head = current;
        return head;
    }

    private ListNode addNewNodeAtStart(int value) {
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static void printSizeOfLinkedList(ListNode head) {
        int size = 0;
        ListNode current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        System.out.println("Size of LinkedList is "+size);

    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }
}
