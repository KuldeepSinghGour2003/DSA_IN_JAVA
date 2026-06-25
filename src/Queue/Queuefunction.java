package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queuefunction {
    public static void main(String[]args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> help = new LinkedList<>();
        while(q.size()>0) {
            System.out.print(q.peek()+" ");
            help.add(q.poll());       //Poll use for remove element
        }
        while(help.size()>0){
            q.add(help.poll());
        }
    }
}
