package LinkedList;

public class DeleteAndReverseCircularList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    static void reverselist(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        ListNode forw =null;
        while(curr!=null){
            forw = curr.next;
            curr.next  = pre;
            pre = curr;
            curr = forw  ;
        }
    }
    static  ListNode reverse(ListNode head){
        ListNode tail = head;
        while(tail.next!=head) {
            tail = tail.next;
        }
        tail.next = null;
        reverselist(head);
        head.next = tail;
        return tail;

    }

    static  ListNode deleteNode(ListNode head,int key){
        ListNode tail = head;
        while(tail.next!=head) tail = tail.next;
        tail.next = null;
        if(head.val==key) {
            head = head.next;
            tail.next = head;
            return head;
        }
        ListNode temp = head;
        ListNode temp2 =  head.next;
        while(temp2!=null){
            if(temp2.val==key){
                temp.next = temp2.next;
                break;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        tail.next = head;
        return head;
    }
    public static  void printlist(ListNode head){
         if(head==null) return ;

//        System.out.println(head.val);
        ListNode temp = head;
        while(temp.next!=head){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println(temp.val);
    }

    public static void main(String[]args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode five = new ListNode(50);
        ListNode six = new ListNode(60);
        ListNode seven = new ListNode(70);
        ListNode eight = new ListNode(80);
        ListNode nine = new ListNode(90);
        ListNode ten = new ListNode(100);


        // Connecting nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;  // Circular connection
        five.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = nine;
        nine.next = ten;
        ten.next = head;

        ListNode rev = reverse(head);
        int key =40;
        ListNode del = deleteNode(rev,key);
//        System.out.println("Reverse and Deleted Circular List:"+ del);
       printlist(del);
    }

}
