package Strings;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s ="anagram";
        String t ="nagaram";
        System.out.println(isAnagram(s, t));
        
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char [] Sorteds = s.toCharArray();
        Arrays.sort(Sorteds);

        char [] Sortedt = t.toCharArray();
        Arrays.sort(Sortedt);

        return Arrays.equals(Sorteds,Sortedt);
    }
}
