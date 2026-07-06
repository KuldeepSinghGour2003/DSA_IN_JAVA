package Queue;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.LinkedList;
import java.util.Queue;

public class QueueusingArray {
    public static class queueArray {
        int r = -1;
        int f = -1;
        int size = 0;
        int[] arr = new int[10];

        public void add(int value) {
            if (arr.length==0) {
                System.out.println("Array is full!");
            }
            if (f == -1)
            {
                f = r = 0;
                arr[0]=value;

            }
            else {

                arr[++r] = value;
            }
            size++;
        }

        public int remove() {
            if (f == 0) {
                System.out.println("Array is Empty!");
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }

        public int peek() {
            if (f == 0) {
                System.out.println("Array is Empty!");
            }
            int x = arr[f];
            return x;
        }

        public boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
            }
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
        public static void main(String[]args){
        queueArray q = new queueArray();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();

        q.remove();
        q.display();

        System.out.println();
        System.out.println(q.peek());

        System.out.println(q.isEmpty());

        System.out.println("Printing an element!");
        q.display();


    }
}
