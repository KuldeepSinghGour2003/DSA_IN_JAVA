package LinkedList;

public class DSA_4_LLSatck {
    public static class Node{//user defiend datatype
        int val;
        Node next;

        Node(int val){//user defiend data structure
            this.val=val;

        }
    }
    public static class LLStack{
        Node head=null;
        int size=0;

       void push(int x){
           Node temp=new Node(x);
           temp.next=head;
           head=temp;
           size++;
       }
       void displayRec(Node h){
           if(h==null) return ;
           displayRec(h.next);
           System.out.print(h.val+" ");
       }
        boolean isFull() {
            if (head.next ==null) {
                return true;
            } else {
                return false;
            }
        }
      void display(){
           displayRec(head);
           System.out.println();
      }
       void displayRev(){
           Node temp =head;
           while(temp!=null){
               System.out.print(temp.val+" ");
               temp=temp.next;
           }
           System.out.println();
       }
        int size(){
           return size;
        }
        int pop(){
           if(head==null){
               System.out.println("Stack is Empty!");
               return -1;
           }
           int x=head.val;
           head=head.next;
           size--;
           return x;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }

            return head.val;
        }
        boolean isEmpty(){
           if(size==0){
               return true;
           }else{
               return false;
           }
        }
    }
    public static void main(String[]args){
        LLStack lls = new LLStack();
        lls.push(1);
        lls.push(4);
        lls.push(8);
        lls.push(9);
        lls.push(94);
        lls.display();

       // lls.pop();
        //lls.display();

        lls.peek();

        lls.displayRev();

        System.out.println(lls.size());

        System.out.println(lls.isEmpty()+"");
     //   System.out.println(lls.isFull()+" ");
        //System.out.println(lls.capacity()+"");
    }
}
