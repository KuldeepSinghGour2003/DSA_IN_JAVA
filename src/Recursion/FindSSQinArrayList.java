package Recursion;

import java.util.ArrayList;

public class FindSSQinArrayList {
    static ArrayList<String> findSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        //Base Case
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }
        char curr = s.charAt(0);

        ArrayList<String> smallsubs = findSSQ(s.substring(1));


        for(String ss:smallsubs){
            ans.add(ss);
            ans.add((curr +ss));
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = findSSQ("abc");
        for(String ss:ans){
            System.out.println(ss);
        }
    }
}
