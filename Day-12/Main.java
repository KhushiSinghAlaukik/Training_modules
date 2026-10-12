import java.util.Scanner;
class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
class AccountNotFoundException extends Exception { 
    AccountNotFoundException(String msg) { 
        super(msg); 
    } 
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String AccNo = "37928732891";
        double balance = 5000;
        try {
            System.out.println("Enter account no.: ");
            String accno = sc.nextLine();
            if(!accno.equals(AccNo)){
                throw new AccountNotFoundException("Account number invalid!");
            }
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            if (amount <= 0) {
                throw new InvalidAmountException("Invalid amount!");
            } else if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful!");
                System.out.println("Balance: " + balance);
            }
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (AccountNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
