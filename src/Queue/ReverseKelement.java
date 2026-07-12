package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelement {
    public static void main(String[]args){
                Queue<Integer> q = new LinkedList<>();
                q.add(2);
                q.add(3);
                q.add(5);
                q.add(1);
                q.add(9);
                System.out.println(q);
                int n=q.size();
                int k=3;
                Stack<Integer> s = new Stack<>();
                for(int i = 0; i < k ; i++){
                    s.push(q.remove());
                }
                while(s.size()>0){
                    q.add(s.pop());

                }
                //System.out.println(q+" ");
                for(int i = 0 ; i < n-k ; i++){
                    q.add(q.remove());
                }
               System.out.println(q+" ");

    }
}
