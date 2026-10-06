public class BankAcc {
    int accNo, balance;
    String name;

    public BankAcc(int accNo, String name, int balance){
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void deposit(int depAmmount){
        System.out.println("Deposited ammount: "+ depAmmount);
        int total = balance+depAmmount;
        System.out.println("Total balance after deposit: "+ total);
    }

    void withdraw(int wdwAmmount){
        System.out.println("WithDrawn ammount: "+ wdwAmmount);
        int total = balance-wdwAmmount;
        System.out.println("Total balance after withdrawal: "+ total);
    }

    void displayDetails(){
        System.out.println("Account number: "+accNo);
        System.out.println("Account holer name: "+name);
        System.out.println("Current Balance: "+ balance);
    }

    public static void main(String[] args){
        BankAcc obj = new BankAcc(56372839, "Veeba", 50000);
        obj.displayDetails();
        obj.withdraw(10000);
        obj.deposit(30000);
    }
}
