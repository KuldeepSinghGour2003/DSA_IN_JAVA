package LinkedList;

public class SinglyToCircularList {
     static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode circularlist(ListNode head){
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        System.out.println("Singly to Circular Linked List:");
       printlist(head);
       return head;
        }


public static  void printlist(ListNode head){
         if(head==null) return ;

//        System.out.println(head.val);
        ListNode temp = head;
        while(temp.next!=head){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(temp.val);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode five = new ListNode(50);


        // Connecting nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;

        ListNode list = circularlist(head);

        // Print the circular list
//        printlist(head);
    }
}
