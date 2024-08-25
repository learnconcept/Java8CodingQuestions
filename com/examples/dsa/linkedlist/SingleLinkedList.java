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
        printSizeOfLinkedList(sll.head);
    }

    private static void printSizeOfLinkedList(ListNode head) {
        int size = 0;
        ListNode current = head;
        while(current != null){
            size++;
            current = current.next;
        }System.out.println("===========");
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
