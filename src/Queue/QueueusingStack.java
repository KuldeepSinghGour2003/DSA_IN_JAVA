package Queue;

import java.util.Stack;

public class QueueusingStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> hel = new Stack<>();

    void push(int x){
        s.push(x);
    }
     int pop(){
        while(s.size()>1){
            hel.push(s.pop());
        }
        int val=s.pop();
         while(hel.size()>0){
             s.push(hel.pop());
         }
        return val;
     }
    int peek(){
        while(s.size()>1){
            hel.push(s.pop());
        }
        int val=s.peek();
        while(hel.size()>1){
            s.push(hel.pop());
        }
        return val;
    }
    boolean isEmpty(){
        if(s.size()==0) return true;
         else return false;
    }
    void display(){
        if(s.size()==0){
            System.out.println("Queue is Empty! ");
        }else{
            System.out.println(s);
        }
    }
    public static void main(String[]args){
        QueueusingStack qs = new QueueusingStack();
        qs.push(1);
        qs.push(2);
        qs.push(3);
        qs.push(4);
        qs.push(5);
        qs.display();

        qs.pop();
        qs.display();

        System.out.println(qs.peek());

        System.out.println(qs.isEmpty());



    }
}
