public class Armstrong {
    public static void main(String[] args){
        int n = 153; 
        int originalNumber = n;
        int result = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += (int)Math.pow(digit, 3);
            originalNumber /= 10;
        }
        if (result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
