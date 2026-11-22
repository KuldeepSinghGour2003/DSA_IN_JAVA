package Recursion;

public class Fibonacci {
    static int Fibona(int n){
        //Base Case
        if(n == 0 || n == 1){
            return n;
        }
        //Recursive Case
        int prev = Fibona(n-1)+Fibona(n-2);
         return prev;
    }
    public static void main(String[] args){
        for(int i = 0; i<=20; i++) {
            System.out.println(Fibona(i));
        }

    }
}
