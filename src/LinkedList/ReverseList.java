package LinkedList;


public class ReverseList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    ListNode head = null;
    ListNode tail = null;

    // Insert node at the end
    public void insert(int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public ListNode reverseList(ListNode head) {


        //ARRAYLIST APPROACH//


        // if(head==null || head.next==null) return head;
        // ListNode temp = head;
        // ArrayList<ListNode> arr = new ArrayList<>();
        // while(temp!=null){
        //     arr.add(temp);
        //     temp = temp.next;
        // }
        // int n = arr.size();
        // for(int i = n-1;i>=1;i--){
        //    ListNode t1 = arr.get(i);
        //    ListNode t2 = arr.get(i-1);
        //    t1.next = t2;
        // }
        // arr.get(0).next = null;
        // return arr.get(n-1);


        //RECURSIVE APPROACH

        if(head==null || head.next==null) return head;
        ListNode a = head.next;
        head.next =null;
        ListNode b = reverseList(a);
        a.next = head;
        return b;

       //ITERATIVE APPROACH

        //       ListNode cur = head;
        //    ListNode forw = head;
        //    ListNode pre = null;
        //    while(cur!=null){
        //     forw = cur.next;
        //     cur.next = pre;
        //     pre=cur;
        //     cur=forw;
        //    }
        //    return pre;
    }
    public void display() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[]args) {
        ReverseList list = new ReverseList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original List:");
        list.display();

        list.head = list.reverseList(list.head);
        list.tail = null;

        System.out.println("Reversed List:");
        list.display();
    }
}
