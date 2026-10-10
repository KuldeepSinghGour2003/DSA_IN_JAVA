package LinkedList;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

class ListNode{
    ListNode next ;
    ListNode pre;
    int val;
    ListNode(int val){ this.val = val ;}
}
class  DLL {
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val) {
        ListNode temp = new ListNode(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head.pre = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val) {
        ListNode temp = new ListNode(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            temp.pre = tail;
            tail = temp;
        }
        size++;
    }

    void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + ",");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayreverse() {
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + ",");
            temp = temp.pre;
        }
        System.out.println();
    }

    void deletetAtHead() {
        if (size == 0) {
            System.out.println("List is Empty!");
        }
        if (size == 1) head = tail = null;
        else {
            head = head.next;
            head.pre = null;


        }
        size--;

    }

    void deletetAtTail() {
        if (size == 0) {
            System.out.println("List is Empty!");
            return;
        }
        if (size == 1) head = tail = null;
        else {
            tail = tail.pre;
            tail.next = null;


        }
        size--;

    }
    void insertAtindex(int idx,int val){
        if(idx<0 || idx>size) {
            System.out.println("Invalid Index!");
            return ;
        }
        if(idx==0) {
            insertAtHead(val);
            return ;
        }
        if(idx==size) {
            insertAtTail(val);
            return ;
        }
        ListNode a  = new ListNode(val);
        ListNode temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        a.pre = temp;
        a.next = temp.next;
        temp.next = a;
        a.next.pre = a;
        size++;
    }

}
public class DoubleyLinkedList {
    public static void main(String[]args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.display();
        list.displayreverse();

        list.deletetAtHead();
        list.deletetAtTail();
        list.display();

    }
}
