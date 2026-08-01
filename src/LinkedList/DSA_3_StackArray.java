package LinkedList;

public class DSA_3_StackArray {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx=0;

        void push(int x){
            if (isFull()) {
                System.out.println("Stack is Full!");
                return ;
            }
            arr[idx]=x;
            idx++;
        }

        void peek(){
            if(idx==0){
                System.out.println("Stack is Empty");
                return;
            }else {
                System.out.println(arr[idx - 1]+"");
            }
        }
        int  pop(){
            if(idx==0){
            System.out.println("Stack is Empty!");
            return -1;
            }
            int top=arr[idx-1];
            idx--;
            return top;
        }
        void display(){
            for(int i=0; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(size()==0){
                return true;
            }else{
                return false;
            }
        }
        int capacity(){
            return arr.length;
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[]args){
        Stack st = new Stack();
        st.push(1);
        st.push(4);
        st.push(8);
        st.push(9);
        st.push(94);
        st.display();

        st.pop();
        st.display();

        st.peek();

        System.out.println(st.size());

       System.out.println(st.isEmpty()+"");
       System.out.println(st.isFull()+" ");
       System.out.println(st.capacity()+"");

    }
}
