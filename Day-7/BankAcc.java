import java.util.Scanner;

public class BankAcc {
    private int accNo, balance;
    private String name, accType;

    public BankAcc(int accNo, String name, String accType, int balance){
        this.accNo = accNo;
        this.name = name;
        this.accType = accType;
        this.balance = balance;
    }

    public int getAccNo(){
        return accNo;
    }
    public String getHolderName(){
        return name;
    }
    public String getAccType(){
        return accType;
    }
    public int getBalance(){
        return balance;
    }

    public void deposit(int ammount){
        if(ammount>0){
            balance += ammount;
            System.out.println("The balance after depositing " + ammount+" is: "+ balance);
        }else{
            System.out.println("Enter valid ammount for deposit !!");
        }
    }

    public void withdraw(int ammount){
        if(ammount<=balance){
            balance -= ammount;
            System.out.println("The balance after withdrawing "+ ammount+" is: "+balance);
        }else{
            System.out.println("Enter valid ammount for withdraw !!");
        }
    }

    public void transValidation(int ammount){
        if(ammount>balance){
            System.out.println("The ammount cannot be withdrawn, but it can be deposited !");
        }else if(ammount<balance && ammount>0){
            System.out.println("This ammount can be withdrawn !");
        }else if(ammount <= 0){
            System.out.println("The ammount is very less for deposit !");
        }else{
            System.out.println("Enter a valid ammount value !");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ammount to check if its eligible for deposit or withdrawal : ");
        int ammount = sc.nextInt();
        System.out.print("Enter the ammount for deposit: ");
        int ammount1 = sc.nextInt();
        System.out.print("Enter the ammount for withdrawal: ");
        int ammount2 = sc.nextInt();
        BankAcc obj = new BankAcc(728392380, "A", "Saving", 60000);
        obj.transValidation(ammount);
        obj.deposit(ammount1);
        obj.withdraw(ammount2);
        obj.getAccNo();
        obj.getHolderName();
        obj.getAccType();
        obj.getBalance();
        sc.close();
    }
}
