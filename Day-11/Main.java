class TextProcessor {
    public String Reverse(String text){
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }
    public int CountChars(String text){
        return text.length();
    }
    public int CountWords(String text){
        return text.trim().split("\\s+").length;
    }
    public boolean Palindrome(String text){
       boolean isPalindrome = false;
       if(text.equals(Reverse(text))){
        isPalindrome = true;
       }
       return isPalindrome;
    }
    public String DuplicateRemove(String text){
        String result = "";
        for(int i=0; i<text.length();i++){
            char ch = text.charAt(i);

            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        return result;
    }
}
public class Main {
public static void main(String[] args) {
    TextProcessor t1 = new TextProcessor();
    String text = "Madam";
    System.out.println("Original: " + text);
    System.out.println("Reversed: " +
            t1.Reverse(text));

    System.out.println("Characters: " +
            t1.CountChars(text));

    System.out.println("Words: " +
            t1.CountWords(text));

    System.out.println("Palindrome: " +
            t1.Palindrome(text));

    System.out.println("Without duplicates: " +
            t1.DuplicateRemove(text));
}
}
