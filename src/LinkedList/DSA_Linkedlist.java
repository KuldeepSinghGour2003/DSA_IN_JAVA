package LinkedList;

public class DSA_Linkedlist {
    public static void displayrecursive(Node head){
        if(head==null) return ;
        System.out.print(head.data+"->");
        displayrecursive(head.next);
    }
    public static void insertAtEnd(Node head, int val ) {
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
    }
    public static void displayreverse(Node head){
        if(head==null) return ;
        displayreverse(head.next);
        System.out.print(head.data+"->");
    }

    public static void Display(Node head){
        Node temp = head;
         while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static class Node{
        int data;//value
        Node  next;//addess of next data

        Node(int data){
           this.data=data;
        }
    }

    public static void main(String[]args)
    {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Display(a);
        System.out.println();
        displayrecursive(a);
        System.out.println();
        displayreverse(a);
        System.out.println(length(a));
        insertAtEnd(a,89);

    }
}
