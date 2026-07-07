package Queue;

public class QueueusingLL {
    public static class Node{// user defined data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class queueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;

        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            } else {
                return head.val;
            }
        }

        public int remove() {
            if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;

            } else {
                int x= head.val;
                head = head.next;
                size--;
                return x;
            }
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }


    }
    public static void main(String[]args)
    {
      queueLL qll = new queueLL();
        qll.add(1);
        qll.add(2);
        qll.add(3);
        qll.add(4);
        qll.add(5);
        qll.display();

        System.out.println();
        qll.remove();
        qll.display();

        System.out.println();
        System.out.println(qll.peek());

        System.out.println(qll.isEmpty());

        System.out.println("Printing an element!");
        qll.display();

        System.out.println();
        System.out.println("Size of Queue is:"+ qll.size);


    }
}
