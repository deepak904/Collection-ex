package org.example.list.linkedlist;

public class LinkedListDemo {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }


    }
    void printLinkedList() {
        Node n = head;
        while(n!=null) {
            System.out.print(n.data+" --> ");
            n = n.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        LinkedListDemo l1 = new LinkedListDemo();

        Node first = l1.new Node(10);
        Node second = l1.new Node(20);
        Node third = l1.new Node(30);
        Node four = l1.new Node(40);
        Node five = l1.new Node(50);

        l1.head = first;
        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;

        l1.printLinkedList();
    }

}
