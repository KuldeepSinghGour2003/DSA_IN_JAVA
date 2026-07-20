package LinkedList;

public class DSA_2_Linkedlist {
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
            }
        }
        public static class Linkedlist1{
            Node head=null;
            Node tail=null;
            int size=0;

            void insertAtTail(int val){
                Node temp = new Node(val);
                if(head==null)
                {
                    head=temp;
                    tail=temp;
                }else{
                    tail.next=temp;
                    tail=temp;
                }
                size++;
            }

            void deleteAt(int idx){
                if(idx==0) head=head.next;
                Node temp=head;
                for(int i=1;i<idx-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                tail=temp;
                size--;
            }
            void insertAtHead(int val){
                Node temp = new Node(val);
                if(head==null){
                    head=tail=temp;
                }else{
                    temp.next=head;
                    head=temp;
                }
                size++;
            }
            void insertAt(int idx, int val){
                Node t= new Node(val);
                Node temp = head;
                if(idx==size){
                    insertAtTail(val);
                    return;
                }
                else if(idx==0){
                    insertAtHead(val);

                }
                for(int i=1; i<=idx-1;i++){
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
                size++;
            }

            int getAT(int idx){
                if(idx<0||idx>size)
                {
                    System.out.println("Wrong index!");
                }
                Node temp=head;
                for(int i=1;i<=idx;i++){
                    temp=temp.next;
                }
                return temp.data;
            }
            void Display(){
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.data+"->");
                    temp=temp.next;
                }
            }
//            int size(){
//                Node temp=head;//order(n) time complexity
//                int count=0;
//                while(temp!=null){
//                    count++;temp=temp.next;
//                }
//                return count;
//            }


        }
        public static void main(String[]args)
        {
            Linkedlist1 ll = new Linkedlist1();
            ll.insertAtTail(9);
            ll.insertAtTail(8);
            ll.insertAtTail(1);
            ll.insertAtTail(7);
            ll.insertAtTail(2);
            ll.insertAtTail(4);
            ll.insertAtTail(5);
            ll.Display();
//
//             System.out.println();
//            System.out.println(ll.size);
//            ll.insertAtHead(5);
//            ll.Display();
//            System.out.println();
//
//            ll.insertAt(2,3);
//            ll.Display();
//            System.out.println();
//
//            System.out.println(ll.tail.data);
//
//            System.out.println();
//            ll.insertAt(0,98);
//            ll.Display();
//
//            System.out.println();
//            System.out.println(ll.getAT(4));
              System.out.println();
              ll.deleteAt(2);
              ll.Display();
              System.out.println();

              ll.deleteAt(3);//If we delete last index value ,bbu6t tail tail is not tail ,if we print tail .So we initailize value of tail in any variables
              ll.Display();
        }
    }


