public class Reverse {
    public static void main(String[] args) {
        int n = 123;
        int originalNumber = n;
        int reversedNumber = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
}
