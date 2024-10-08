package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        StringBuilder newString = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                newString.append(Character.toLowerCase(ch));
            }
        }
        int start =0;
        int end = newString.length()-1;
        while(start<end){
            if(newString.charAt(start)!= newString.charAt(end)){
                return false;
            }
            start++;
            end--;
            
        }
        return true;

    }
}
