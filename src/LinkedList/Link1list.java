package LinkedList;


class Node{
    int val;//null
    Node next;//null
    Node(int val){
        this.val = val ;
    }
}
class linkedlist {
    Node head;
    Node tail;
  int size=0;
    void addAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addAthead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        temp.next = head;
        head = temp;
        size++;
    }
    int search(int val) {
        if (head == null)  return -1;
        Node temp =head;
        int idx=0;
        while(temp!=null) {
            if (temp.val == val) return idx;

            temp = temp.next;
            idx++;
        }
        return  -1;
    }
    //
    void deleteAthead() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        head = head.next;
        if(head==null) tail=null;
        size--;
    }
    //
    void deleteAtTail() {
        if (tail == null) {
            System.out.println("List is Empty!");
            return;
        }
        head = head.next;
        if(head==null) tail=null;
        size--;
    }
//
    int get(int idx){
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    //

    void insert(int idx,int val) {
        if(idx<0 || size<idx ) {
            System.out.println("Invalid Index!");
        }
        else if(idx==0) addAthead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp=head;
            for(int i=1;i<=idx-1;i++) {
                temp =  temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    //
    void delete(int idx){
        if(idx<0 || idx>size){
            System.out.println("Invalid index!");
            return;
        }
        if(idx==0){
            deleteAthead();
            return;
        }
        Node temp =head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;//delete
        if(idx==size-1) tail=temp;//We deleting tail
        size--;
    }

//
    void display() {
        if (head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + ",");
            temp = temp.next;
        }
    }
}
//

public  class Link1list {
    public static  void main(String[]args){
       linkedlist ll = new linkedlist();
       ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);

       ll.display();
        System.out.println();
        ll.addAthead(50);
        ll.display();
        ll.deleteAthead();
        System.out.println();
        ll.display();
        System.out.println();

        int  idx =2;
        int result = ll.get(idx);
        System.out.println("Value is:"+result+" at index"+idx);

        int resultSearch = ll.search(40);
        System.out.println("Search element:"+resultSearch);
        ll.insert(3,90);
        ll.display();

        System.out.println();
        ll.delete(2);
        ll.display();

    }

    }

