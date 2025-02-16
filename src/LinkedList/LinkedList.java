package LinkedList;

import java.util.*;

class Node{
    int data;
    Node next;

    //Constructor to initialize a node
    Node(int val){
        this.data = val;
        this.next = null;
    }
}
public class LinkedList {
    public static Node convertArrToLL(int[] arr){

        int size = arr.length;
        if(size==0) return null;

        //Create head of linked list
        Node head = new Node(arr[0]);
        Node current = head;

        //Iterate through array & create linked list nodes
        for(int i=1; i<size; i++){
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;

    };

    public static void printLinkedList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArrToLL(arr);
        printLinkedList(head);
    }
}
