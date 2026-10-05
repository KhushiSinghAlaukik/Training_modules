public class Palindrome {
    public static void main(String[] args){
        int n = 121;
        int originalNum = n;
        int reversedNum = 0;
        while (originalNum != 0) {
            int digit = originalNum % 10;
            reversedNum = reversedNum * 10 + digit;
            originalNum /= 10;
        }
        if (reversedNum == n)
            System.out.println(n + " is a palindrome.");
        else
            System.out.println(n + " is not a palindrome.");
    }
}
