package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueueusingStack {
    public static void main(String[]args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(8);
        q.add(7);
        System.out.println(q);

        Stack<Integer> s = new Stack<>();
        int x=q.size()/2;
        for(int i=1;i<=x;i++){
            s.push(q.remove());
        }
        while(s.size()>0){
            q.add(s.pop());
        }
        for(int i=1;i<=x;i++){
            s.push(q.remove());
        }
        for(int i=1;i<=x;i++){
            q.add(s.pop());
            q.add(q.remove());
        }

        while(q.size()>0){
            s.push(q.remove());
        }
        while(s.size()>0){
            q.add(s.pop());
        }
        System.out.println("Final Reverse Queue :"+ q);


    }
}
