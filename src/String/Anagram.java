package String;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
        public static boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()) return false;
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
            for(int i=0;i<t.length();i++){
                char ch = t.charAt(i);
                if(!map.containsKey(ch)) return false;
                int freq = map.get(ch);
                if(freq==0) return false;
                map.put(ch,freq-1);
            }
            return true;
        }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first String:");
            String s = sc.nextLine();
            System.out.println("Enter the Second String:");
            String t = sc.nextLine();
            boolean a = isAnagram(s,t);
//            if(a== true){
            if(a){
                System.out.println("String is Anagram!");
            }else
            System.out.println("String is not Anagarm!");

        }
    }


