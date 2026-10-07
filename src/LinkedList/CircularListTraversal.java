package LinkedList;

public class CircularListTraversal {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static  void printlist(ListNode head){
        System.out.println(head.val);
        ListNode temp = head;
        while(temp.next!=head){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(temp.val);
    }

    public static void main(String[]args){
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        // Connecting nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = head;  // Circular connection

        printlist(head);
    }
}
