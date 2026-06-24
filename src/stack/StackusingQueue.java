package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class StackusingQueue {
    Queue<Integer> q1 = new LinkedList<>();

    void push(int val){
        q1.add(val);
    }
    int  pop(){
        for(int i=1;i<=q1.size()-1;i++){
            q1.add(q1.remove());

        }
        int a = q1.peek();
        q1.remove();
        return a;


        }
    int peek() {
        for (int i = 1; i <= q1.size() - 1; i++) {
            q1.add(q1.remove());
        }
        int a = q1.peek();
        q1.add(a);//            q1.add(q1.remove());
        return a;
    }
    boolean isEmpty(){
        if(q1.size()==0) return true;
        else return false;
    }
    void display(){
        if(q1.size()==0){
            System.out.println("Queue is Emptt! ");
        }else{
            System.out.println(q1);
        }
    }

    public static void main(String[]args){
        StackusingQueue sq= new StackusingQueue();
        sq.push(1);
        sq.push(2);
        sq.push(3);
        sq.push(4);
        sq.push(5);
        sq.display();

        sq.pop();
        sq.display();

        System.out.println(sq.peek());

        System.out.println(sq.isEmpty());



    }
}
