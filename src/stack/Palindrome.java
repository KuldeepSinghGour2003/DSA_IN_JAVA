package stack;

public class Palindrome {
    static boolean palindrome(int x){
        int temp =x;
        int sum=0,rem;
        while(x>0 && x!=0){
            rem = x%10;
            sum = sum*10 + rem;
             x  = x/10;

        }
        if(temp == sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int x = -121;
        System.out.println(palindrome(x));

    }
}
