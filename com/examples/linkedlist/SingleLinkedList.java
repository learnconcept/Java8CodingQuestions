package com.examples.linkedlist;

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
        SingleLinkedList sLL= new SingleLinkedList();
        sLL.head = new ListNode(20);
        ListNode second = new ListNode(12);
        ListNode third = new ListNode(11);
        ListNode fourth = new ListNode(2);

        sLL.head.next = second;
        second.next = third;
        third.next = fourth;

        //System.out.println(head);

    }
}
